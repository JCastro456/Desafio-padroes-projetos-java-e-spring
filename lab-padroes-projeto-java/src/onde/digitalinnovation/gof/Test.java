package onde.digitalinnovation.gof;

import onde.digitalinnovation.gof.facade.Facade;
import onde.digitalinnovation.gof.singleton.SingletonEager;
import onde.digitalinnovation.gof.singleton.SingletonLazy;
import onde.digitalinnovation.gof.singleton.SingletonLazyHolder;
import onde.digitalinnovation.gof.strategy.Comportamento;
import onde.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import onde.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import onde.digitalinnovation.gof.strategy.ComportamentoNormal;
import onde.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
	  //Singleton
		
	  SingletonLazy lazy = SingletonLazy.getInstancia();
	  System.out.println(lazy);
	  lazy = SingletonLazy.getInstancia();
	  System.out.println(lazy);
	  
	  SingletonEager eager = SingletonEager.getInstancia();
	  System.out.println(eager);
	  eager = SingletonEager.getInstancia();
	  System.out.println(eager);
	  
	  SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
	  System.out.println(lazyHolder);
	  lazyHolder = SingletonLazyHolder.getInstancia();
	  System.out.println(lazyHolder);

	  //Strategy
	  
	  Comportamento normal = new ComportamentoNormal();
	  Comportamento defensivo = new ComportamentoDefensivo();
	  Comportamento agressivo = new ComportamentoAgressivo();

	  Robo robo = new Robo();
	  robo.setComportamento(normal);
	  robo.mover(); 
	  robo.mover();
	  robo.setComportamento(defensivo);
	  robo.mover();
	  robo.mover();
	  robo.setComportamento(agressivo);
	  robo.mover();
	  robo.mover();
   	
	  // Facade
	
	  Facade facade = new Facade();
	  facade.migrarCliente("Jackeline", "21777999");
	  
	  
	} 
	  
}
