package com.john_pank.chapter14.task14;

/**
 * Filosofia_Java
 * Created by John Pank on 02.12.2016.
 */

import java.util.*;

interface Factorys<T> {T create();}

class Part {
	public String toString() {
		return getClass().getSimpleName();
	}
	
	static List<Factorys<? extends Part>> partFactories = new ArrayList<Factorys<? extends Part>>();
	
	static {
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	
	private static Random rand = new Random();
	public static Part createRandom() throws IllegalAccessException, InstantiationException {
		int n = rand.nextInt(partFactories.size());
		Class<? extends Part> c = partFactories.get(n).create().getClass();
		return c.newInstance();
	}	
}

class Filter extends Part {}

class FuelFilter extends Filter {
	public static class Factory implements Factorys<FuelFilter> {
		public FuelFilter create() {
			return new FuelFilter();
		}
	}
}

class AirFilter extends Filter {
	public static class Factory implements Factorys<AirFilter> {
		public AirFilter create() {
			return new AirFilter();
		}
	}
}

class CabinAirFilter extends Filter {
	public static class Factory implements Factorys<CabinAirFilter> {
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter {
	public static class Factory implements Factorys<OilFilter> {
		public OilFilter create() {
			return new OilFilter();
		}
	}
}

class Belt extends Part {}

class FanBelt extends Belt {
	public static class Factory implements Factorys<FanBelt> {
		public FanBelt create() {
			return new FanBelt();
		}
	}
}

class PowerSteeringBelt extends Belt {
	public static class Factory implements Factorys<PowerSteeringBelt> {
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}
}

class GeneratorBelt extends Belt {
	public static class Factory implements Factorys<GeneratorBelt> {
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}

public class RegisteredFactoriesTwo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		for(int i = 0; i < 10; i++)
			System.out.println(Part.createRandom());
	}
}
