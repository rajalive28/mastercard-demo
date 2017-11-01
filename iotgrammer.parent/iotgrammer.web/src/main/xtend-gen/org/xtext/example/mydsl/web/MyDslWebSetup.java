/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.util.Modules;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.xtext.example.mydsl.MyDslRuntimeModule;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.web.MyDslWebModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class MyDslWebSetup extends MyDslStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  @Override
  public Injector createInjector() {
    final MyDslRuntimeModule runtimeModule = new MyDslRuntimeModule();
    final MyDslWebModule webModule = new MyDslWebModule(this.executorServiceProvider);
    Modules.OverriddenModuleBuilder _override = Modules.override(runtimeModule);
    Module _with = _override.with(webModule);
    return Guice.createInjector(_with);
  }
  
  public MyDslWebSetup(final Provider<ExecutorService> executorServiceProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
  }
}
