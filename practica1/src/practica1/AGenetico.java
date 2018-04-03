/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import practica1.Funciones.Funcion1;
import practica1.Funciones.Funcion2;
import practica1.Funciones.Funcion3;
import practica1.Funciones.Funcion4;
import practica1.Funciones.Funcion5;
import practica1.cromosomas.Cromosoma;
import practica1.cromosomas.Cromosoma1;
import practica1.cromosomas.Cromosoma2;
import practica1.cromosomas.Cromosoma3;
import practica1.cromosomas.Cromosoma4;
import practica1.cromosomas.Cromosoma5;

/**
 *
 * @author usuario_local
 */
public class AGenetico {

    Cromosoma[] poblacion;//poblacion de cromosomas
    double[] cromosomasEvaluados;//valores de los cromosomas al evaluar su fitness
    String tipo;//nombre de la funcion que se va ejecutar
    int tamPoblacion;//tama�o de la poblacion
    int numGeneraciones; // Número de generaciones dado
    Cromosoma mejor;//mejor cromosoma encontrado
    double[] mejoresAbsolutos;//array con los mejores cromosomas encontrados hasta el momento
    double[] medias;//array con las medias de cada generacion
    double[] mejoresGeneracion;//array con los mejores cromosomas de cada generacion
    int posicionMejor;//posicion en el array del mejor cromosoma
    double probabilidadCruce;
    double probabilidadMutacion;
    double tolerancia;
    int numeroCombatientes;//numero de combatientes en seleccion por torneo
    Selectores selector;//tipo de seleccion
    int generacionActual;
    int numGenes;//numero de genes que tendra la funcion
    double elitismo;
    ArrayList<Cromosoma> eliteSeleccionada;//array que guarda la elite

    
    /**
     * constructora para las funciones 1,2,3 con el selector de combatientes
     * por defecto 2
     * @param tamPoblacion
     * @param numGeneraciones
     * @param probabilidadCruce
     * @param probabilidadMutacion
     * @param tolerancia
     * @param selector
     * @param funcion
     */
    public AGenetico(int tamPoblacion, int numGeneraciones, double probabilidadCruce, double probabilidadMutacion,
            double tolerancia, Selectores selector, String funcion, double elitismo) {
        this.tamPoblacion = tamPoblacion;
        this.numGeneraciones = numGeneraciones;
        this.mejor = null;
        this.probabilidadCruce = probabilidadCruce;
        this.probabilidadMutacion = probabilidadMutacion;
        this.tolerancia = tolerancia;
        this.selector = selector;
        this.tipo = funcion;
        this.numeroCombatientes = 2;
        this.elitismo = elitismo;
        this.eliteSeleccionada = new ArrayList<Cromosoma>();
        this.mejoresAbsolutos = new double[this.numGeneraciones];
        this.mejoresGeneracion = new double[this.numGeneraciones];
        this.medias = new double[this.numGeneraciones];
    }
    /**
     * constructora para las funciones 1,2 y 3 con numero de combatientes
     * eliteSeleccionada
     * @param tamPoblacion
     * @param numGeneraciones
     * @param probabilidadCruce
     * @param probabilidadMutacion
     * @param tolerancia
     * @param selector
     * @param funcion
     * @param numCombatientes
     */
    public AGenetico(int tamPoblacion, int numGeneraciones, double probabilidadCruce, double probabilidadMutacion,
            double tolerancia, Selectores selector, String funcion,
            int numCombatientes, double elitismo) {
        this.tamPoblacion = tamPoblacion;
        this.numGeneraciones = numGeneraciones;
        this.mejor = null;
        this.probabilidadCruce = probabilidadCruce;
        this.probabilidadMutacion = probabilidadMutacion;
        this.tolerancia = tolerancia;
        this.selector = selector;
        this.tipo = funcion;
        this.numeroCombatientes = numCombatientes;
        this.elitismo = elitismo;
        this.eliteSeleccionada = new ArrayList<Cromosoma>();
        this.mejoresAbsolutos = new double[this.numGeneraciones];
        this.mejoresGeneracion = new double[this.numGeneraciones];
        this.medias = new double[this.numGeneraciones];
    }
    
    /**
     * constructora para la funcion 5 con numero de combatientes 
     * por defecto 2
     * @param tamPoblacion
     * @param numGeneraciones
     * @param probabilidadCruce
     * @param probabilidadMutacion
     * @param tolerancia
     * @param selector
     * @param numGenes
     * @param funcion
     */
    
    public AGenetico(int tamPoblacion, int numGeneraciones, double probabilidadCruce, double probabilidadMutacion,
            double tolerancia, Selectores selector,int numGenes,
            String funcion, double elitismo) {
        this.tamPoblacion = tamPoblacion;
        this.numGeneraciones = numGeneraciones;
        this.mejor = null;
        this.probabilidadCruce = probabilidadCruce;
        this.probabilidadMutacion = probabilidadMutacion;
        this.tolerancia = tolerancia;
        this.selector = selector;
        this.tipo = funcion;
        this.numGenes = numGenes;
        this.numeroCombatientes = 2;
        this.elitismo = elitismo;
        this.eliteSeleccionada = new ArrayList<Cromosoma>();
        this.mejoresAbsolutos = new double[this.numGeneraciones];
        this.mejoresGeneracion = new double[this.numGeneraciones];
        this.medias = new double[this.numGeneraciones];
    }

    
    /**
     * Constructora que se utiliza en la funcion 5 con numero de 
     * combatientes eliteSeleccionada
     * @param tamPoblacion
     * @param numGeneraciones
     * @param probabilidadCruce
     * @param probabilidadMutacion
     * @param tolerancia
     * @param selector
     * @param numeroCombatientes
     * @param funcion
     * @param numGenes
     */
    public AGenetico(int tamPoblacion, int numGeneraciones, double probabilidadCruce, double probabilidadMutacion,
            double tolerancia, Selectores selector, int numeroCombatientes,
            String funcion, int numGenes, double elitismo) {
        this.tamPoblacion = tamPoblacion;
        this.numGeneraciones = numGeneraciones;
        this.mejor = null;
        this.probabilidadCruce = probabilidadCruce;
        this.probabilidadMutacion = probabilidadMutacion;
        this.tolerancia = tolerancia;
        this.selector = selector;
        this.tipo = funcion;
        this.numeroCombatientes = numeroCombatientes;
        this.numGenes = numGenes;
        this.elitismo = elitismo;
        this.eliteSeleccionada = new ArrayList<Cromosoma>();
        this.mejoresAbsolutos = new double[this.numGeneraciones];
        this.mejoresGeneracion = new double[this.numGeneraciones];
        this.medias = new double[this.numGeneraciones];
    }


    public Cromosoma[] getPoblacion() {
        return this.poblacion;
    }

    public int getTamPoblacion() {
        return this.tamPoblacion;
    }

    public int getNumGeneraciones() {
        return this.numGeneraciones;
    }

    public Cromosoma getMejor() {
        return this.mejor;
    }

    public int getPosicionMejor() {
        return this.posicionMejor;
    }

    public double getProbabilidadCruce() {
        return this.probabilidadCruce;
    }

    public double getProbabilidadMutacion() {
        return this.probabilidadMutacion;
    }

    public double getTolerancia() {
        return this.tolerancia;
    }

    public Selectores getSelector() {
        return this.selector;
    }

    // FUNCIONES
    public void aumentarGeneracion() {
        this.generacionActual++;
    }
    /**
     * inicializa el algoritmo genetico
     */
    public void inicializa() {
        this.poblacion = generaPoblacion();
        this.mejor = this.duplicarCromosoma(this.poblacion[0]);
        calcularFitness(mejor);
        this.generacionActual = 0;
        this.cromosomasEvaluados = new double[this.tamPoblacion];
    }
    /**
     * genera una poblacion aleatoria
     * @return
     */
    public Cromosoma[] generaPoblacion() {
        Cromosoma[] poblacion = new Cromosoma[this.tamPoblacion];
        if (tipo.equals("F1")) {
            for (int i = 0; i < this.tamPoblacion; i++) {
                poblacion[i] = new Cromosoma1(this.tolerancia);
            }
        } else if (tipo.equals("F2")) {
            for (int i = 0; i < this.tamPoblacion; i++) {
                poblacion[i] = new Cromosoma2(this.tolerancia);
            }
        } else if (tipo.equals("F3")) {
            for (int i = 0; i < this.tamPoblacion; i++) {
                poblacion[i] = new Cromosoma3(this.tolerancia);
            }
        } else if (tipo.equals("F4")) {
            for (int i = 0; i < this.tamPoblacion; i++) {
                poblacion[i] = new Cromosoma4(this.tolerancia);
            }
        } else if (tipo.equals("F5")) {
            for (int i = 0; i < this.tamPoblacion; i++) {
                poblacion[i] = new Cromosoma5(this.tolerancia, this.numGenes);
            }
        }

        return poblacion;
    }
    /**
     * ejecuta el proceso de seleccion de la poblacion
     * @param tipo indica si la función es de maximizacion (true) o de minimizacion (false)
     */
    public void seleccion(boolean tipo) {
        switch (this.selector) {
            case RULETA:
                seleccionRuleta();
                break;
            case TORNEO:
                seleccionTorneo(this.numeroCombatientes, tipo);
                break;
            case ESTOCASTICO:
                seleccionEstocastica();
                break;
        }
    }
    /**
     * seleccion por ruleta
     */
    private void seleccionRuleta() { //WIP
        double total = 0.0;
        double[] ruleta = new double[this.tamPoblacion];
        double aleatorio;
        boolean encontrado = false;
        Cromosoma[] generacionNueva = new Cromosoma[this.tamPoblacion];
 
        //calculamos el total
        for (int i = 0; i < this.tamPoblacion; i++) {
            total += this.cromosomasEvaluados[i];
        }
        //calculamos las partes de cada cromosoma
        for (int i = 0; i < this.tamPoblacion; i++) {
            ruleta[i] = this.cromosomasEvaluados[i] / total;
        }
        //sumamos el valor acumulado
        for (int i = 1; i < this.tamPoblacion; i++) {
            ruleta[i] = ruleta[i] + ruleta[i - 1];
        }
        //elegimos la nueva poblacion
        for (int i = 0; i < this.tamPoblacion; i++) {
            aleatorio = Math.random();
            int j = 0;
            while (!encontrado) {
                if (aleatorio < ruleta[j]) {
                    generacionNueva[i] = duplicarCromosoma(this.poblacion[j]);
                    encontrado = true;
                } else {
                    j++;
                }
            }
            encontrado = false;
        }
        this.poblacion = generacionNueva;
    }
    /**
     * metodo de seleccion estocastica
     */
    private void seleccionEstocastica() {
        double total = 0.0;
        double[] valores = new double[this.tamPoblacion];
        boolean encontrado = false;
        Cromosoma[] generacionNueva = new Cromosoma[this.tamPoblacion];
        
        
        for (int i = 0; i < this.tamPoblacion; i++) {
            //calculamos el total
            total += this.cromosomasEvaluados[i];
            
            //calculamos los valores de cada individuo
            valores[i] = this.cromosomasEvaluados[i] / total;
            
            
        }
        
        //calculamos los valores acumulados
        for (int i = 1; i < this.tamPoblacion; i++) {
            valores[i] = valores[i] + valores[i - 1];
        }
        //elegimos los individuos
        for (int i = 0; i < this.tamPoblacion; i++) {
            int j = 0;
            double valor = (1.0 * i) / this.tamPoblacion;
            while (!encontrado && j<this.tamPoblacion) {
                if (valor < valores[j]) {
                    generacionNueva[i] = duplicarCromosoma(this.poblacion[j]);
                    encontrado = true;
                } else {
                    j++;
                }
            }
            if(j > this.tamPoblacion)
            	generacionNueva[i] = duplicarCromosoma(this.poblacion[j-1]);
            encontrado = false;
        }
        this.poblacion = generacionNueva;
    }
    /**
     * seleccion por torneo
     * @param elementos
     * @param tipo indica si la función es de maximizacion (true) o de minimizacion (false)
     */
    private void seleccionTorneo(int elementos, boolean tipo) {
        
        Cromosoma[] generacionNueva = new Cromosoma[this.tamPoblacion];
        int posicionElegido = -1;
        
        for (int i = 0; i < this.tamPoblacion; i++) {
        	int aleatorio = (int) (Math.random() * this.tamPoblacion);
        	double mejor = this.cromosomasEvaluados[aleatorio];
        	posicionElegido = aleatorio;
                
            for (int j = 1; j < elementos; j++) {
                aleatorio = (int) (Math.random() * this.tamPoblacion);
                if (compararFitness(this.cromosomasEvaluados[aleatorio], mejor, tipo) != mejor) {
                    mejor = this.cromosomasEvaluados[aleatorio];
                    posicionElegido = aleatorio;
                }
            }
            generacionNueva[i] = duplicarCromosoma(this.poblacion[posicionElegido]);
        }
        this.poblacion = generacionNueva;
    }
    /**
     * compara dos fitness de dos cromosomas
     * @param primerFitness
     * @param segundoFitness
     * @param tipo indica si la función es de maximizacion (true) o de minimizacion (false)
     * @return
     */
    private double compararFitness(double primerFitness, double segundoFitness, boolean tipo) {
        if(tipo){
            if (primerFitness > segundoFitness) {
                return primerFitness;
            } else {
                return segundoFitness;
            }
        }
        else {
            if (primerFitness < segundoFitness) {
                return primerFitness;
            } else {
                return segundoFitness;
            }
        }
        
    }
    /**
     * muta un cromosoma
     */
    public void mutacion() {
        for (int i = 0; i < this.tamPoblacion; i++) {
            this.poblacion[i].mutar(this.probabilidadMutacion);
        }
    }
    /**
     * selecciona el mejor de cada generacion
     * @param tipo indica si la función es de maximizacion (true) o de minimizacion (false)
     * @return
     */
    public double mejorDeGeneracion(boolean tipo) {
        double mejorLocal = 0;

        for (int i = 0; i < this.tamPoblacion; i++) {
            mejorLocal = compararFitness(mejorLocal, this.cromosomasEvaluados[i], tipo);
        }

        return mejorLocal;
    }	
    /**
     * calcula el fitness de cada individuo
     * @param cromosoma
     * @return
     */
    public double calcularFitness(Cromosoma cromosoma) { //WIP
        double valor = 0;
        cromosoma.calculaFenotipo();
        switch (this.tipo) {
            case "F1":
                valor = Funcion1.evalua(cromosoma.getFenotipo()[0]);
                cromosoma.setFitness(valor);
                break;
            case "F2":
                valor = Funcion2.evalua(cromosoma.getFenotipo()[0], cromosoma.getFenotipo()[1]);
                cromosoma.setFitness(valor);
                break;
            case "F3":
                valor = Funcion3.evalua(cromosoma.getFenotipo()[0], cromosoma.getFenotipo()[1]);
                cromosoma.setFitness(valor);
                break;
            case "F4":
                valor = Funcion4.evalua(cromosoma.getFenotipo()[0], cromosoma.getFenotipo()[1]);
                cromosoma.setFitness(valor);
                break;
            case "F5":
                valor = Funcion5.evalua(cromosoma);
                cromosoma.setFitness(valor);
                break;
        }

        return valor;
    }
    /**
     * evalua a la poblacion segun su fitness y va guardando los mejores y las medias
     */
    public void evaluarPoblacion() { //WIP
    	double mejorGeneracion = this.cromosomasEvaluados[0];//
        switch (this.tipo) {
            case "F1":
                for (int i = 0; i < this.tamPoblacion; i++) {
                    this.cromosomasEvaluados[i] = calcularFitness(this.poblacion[i]);
                    //System.out.println("Generacion: " + i + " - Fitness: " + this.cromosomasEvaluados[i]);
                    
                    if (this.cromosomasEvaluados[i] > this.mejor.getFitness())
                        this.mejor = this.duplicarCromosoma(poblacion[i]);
                    
                   if (this.cromosomasEvaluados[i] > mejorGeneracion)
                    	mejorGeneracion = this.cromosomasEvaluados[i];
                }
                break;
            case "F2":
                for (int i = 0; i < this.tamPoblacion; i++) {
                    this.cromosomasEvaluados[i] = calcularFitness(this.poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] < this.mejor.getFitness())
                    	this.mejor = this.duplicarCromosoma(poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] < mejorGeneracion)
                    	mejorGeneracion = this.cromosomasEvaluados[i];
                }
                break;
            case "F3":
                for (int i = 0; i < this.tamPoblacion; i++) {
                    this.cromosomasEvaluados[i] = calcularFitness(this.poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] > this.mejor.getFitness())
                    	this.mejor = this.duplicarCromosoma(poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] > mejorGeneracion)
                    	mejorGeneracion = this.cromosomasEvaluados[i];
                }
                break;
            case "F4":
                for (int i = 0; i < this.tamPoblacion; i++) {
                    this.cromosomasEvaluados[i] = calcularFitness(this.poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] < this.mejor.getFitness())
                    	this.mejor = this.duplicarCromosoma(poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] < mejorGeneracion)
                    	mejorGeneracion = this.cromosomasEvaluados[i];
                }
                break;
            case "F5":
                for (int i = 0; i < this.tamPoblacion; i++) {
                    this.cromosomasEvaluados[i] = calcularFitness(this.poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] < this.mejor.getFitness())
                    	this.mejor = this.duplicarCromosoma(poblacion[i]);
                    
                    if (this.cromosomasEvaluados[i] < mejorGeneracion)
                    	mejorGeneracion = this.cromosomasEvaluados[i];
                }
                break;
        }
        if(this.generacionActual < this.numGeneraciones){
            this.mejoresAbsolutos[this.generacionActual] = this.mejor.getFitness();
            this.mejoresGeneracion[this.generacionActual] = mejorGeneracion;
            this.medias[this.generacionActual] = this.calcularMediaGeneracion(); 
        }
    }
    /**
     * calcula la media de la generacion
     * @return
     */
    public double calcularMediaGeneracion() {
        double total = 0;
        for (int i = 0; i < this.tamPoblacion; i++) {
            total += this.cromosomasEvaluados[i];
        }
        return total / this.tamPoblacion;
    }
    /**
     * ordena la poblacion de cromosomas de menor a mayor fitness
     * @param poblacion
     * @param izq
     * @param der
     */
    public void ordenarPoblacion(Cromosoma[] poblacion, int izq, int der) {
        
        int i = izq;
        int j = der;
        
        Cromosoma pivote = poblacion[(i+j)/2];
        
        do {
            while (poblacion[i].getFitness() < pivote.getFitness()){
                i++;
            }
            while (poblacion[j].getFitness() > pivote.getFitness()){
                j--;
            }
            if (i<=j){
                Cromosoma aux = poblacion[i];
                poblacion[i] = poblacion[j];
                poblacion[j] = aux;
                i++;
                j--;
            }
        }while(i<=j);
        if (izq<j){
            ordenarPoblacion(poblacion, izq, j);
        }
        if (i<der){
            ordenarPoblacion(poblacion, i, der);
        }
    }
    /**
     * mete la elite seleccionada en la poblacion
     */
    public void incluirElite() { //WIP
    	int numeroEliteSeleccionada = (int) (this.tamPoblacion * this.elitismo);
    	this.ordenarPoblacion(this.poblacion, 0, this.tamPoblacion-1);
        
    	switch(this.tipo) {
    	case "F1":
    		for (int i = 0; i < numeroEliteSeleccionada; i++)
    			this.poblacion[i] = duplicarCromosoma(this.eliteSeleccionada.get(i));
    		break;
    	case "F2":
    		for (int i = 1; i <= numeroEliteSeleccionada; i++)
    			this.poblacion[this.tamPoblacion-i] = duplicarCromosoma(this.eliteSeleccionada.get(i-1));
    		break;
    	case "F3":
    		for (int i = 0; i < numeroEliteSeleccionada; i++)
    			this.poblacion[i] = duplicarCromosoma(this.eliteSeleccionada.get(i));
    		break;
    	case "F4":
    		for (int i = 1; i <= numeroEliteSeleccionada; i++)
    			this.poblacion[this.tamPoblacion-i] = duplicarCromosoma(this.eliteSeleccionada.get(i-1));
    		break;
    	case "F5":
    		for (int i = 1; i <= numeroEliteSeleccionada; i++)
    			this.poblacion[this.tamPoblacion-i] = duplicarCromosoma(this.eliteSeleccionada.get(i-1));
    		break;
    	}
    }
    /**
     * selecciona la elite de una poblacion
     */
    public void seleccionarElite() { //WIP
    	int numeroeliteSeleccionada = (int) (this.tamPoblacion * this.elitismo);
    	this.ordenarPoblacion(this.poblacion, 0, this.tamPoblacion-1);
    	this.eliteSeleccionada.clear();
    	switch(this.tipo) {
    	case "F1":
    		for (int i = 1 ; i <= numeroeliteSeleccionada; i++)
    			this.eliteSeleccionada.add(duplicarCromosoma(this.poblacion[this.tamPoblacion-i]));
    		break;
    	case "F2":
    		for (int i = 0 ; i < numeroeliteSeleccionada; i++)
    			this.eliteSeleccionada.add(duplicarCromosoma(this.poblacion[i]));
    		break;
    	case "F3":
    		for (int i = 1; i <= numeroeliteSeleccionada; i++)
    			this.eliteSeleccionada.add(duplicarCromosoma(this.poblacion[this.tamPoblacion-i]));
    		break;
    	case "F4":
    		for (int i = 0 ; i < numeroeliteSeleccionada; i++)
    			this.eliteSeleccionada.add(duplicarCromosoma(this.poblacion[i]));
    		break;
    	case "F5":
    		for (int i = 0 ; i < numeroeliteSeleccionada; i++)
    			this.eliteSeleccionada.add(duplicarCromosoma(this.poblacion[i]));
    		break;
    	}
    }
    /**
     * cruce de cromosomas en un punto
     */
    public void cruzar() {
        
        ArrayList<Cromosoma> array = new ArrayList<Cromosoma>();
        ArrayList<Integer> posiciones = new ArrayList<Integer>();
        boolean[] c1, c2;
        int j = 0;

        for (int i = 0; i < this.tamPoblacion; i++) {
            double aleatorio = Math.random();
            if (aleatorio < this.probabilidadCruce) {
                array.add(this.poblacion[i]);
                posiciones.add(i);
                j++;
            }
        }
        if (j % 2 == 1) {
        	array.remove(j-1);
            j--;
        }
        for (int i = 0; i < j-1; i += 2) {
            try {
                c1 = array.get(i).getIndividuo();
                c2 = array.get(i+1).getIndividuo();
                int puntoCorte = (int) (Math.random() * (c1.length - 1)) + 1;// creo que genera un aleatorio entre 1 y la
                boolean[] corte1 = new boolean[c1.length-puntoCorte];
                boolean[] corte2 = new boolean[c2.length-puntoCorte];
                // penultima pos del array
                
                int l = 0;
                for (int k = puntoCorte; k < c1.length; k++) {
                    corte1[l] = c1[k];
                    corte2[l] = c2[k];

                    c1[k] = corte2[l];
                    c2[k] = corte1[l];

                    l++;
                }

                this.poblacion[posiciones.get(i)].setIndividuo(c1);
                this.poblacion[posiciones.get(i + 1)].setIndividuo(c2);
            }catch(Exception e) {
                    System.out.print(1);
            }
        }
    }
    
    public double[] getMedias() {
    	return this.medias;
    }
    
    public double[] getMejoresAbsolutos() {
    	return this.mejoresAbsolutos;
    }
    
    public double[] getMejoresGeneracion() {
    	return this.mejoresGeneracion;
    }
    /**
     * metodo que genera un nuevo cromosoma igual a uno dado
     * @param c
     * @return
     */
    public Cromosoma duplicarCromosoma(Cromosoma c) { //WIP
    	Cromosoma nuevo = null ;
    	switch(this.tipo) {
    	case "F1":
    		nuevo = new Cromosoma1(this.tolerancia);
    		nuevo.setFitness(c.getFitness());
    		nuevo.setIndividuo(c.getIndividuo());
    		nuevo.setPuntAcumulada(c.getPuntAcumulada());
    		nuevo.calculaFenotipo();
    		break;
    	case "F2":
    		nuevo = new Cromosoma2(this.tolerancia);
    		nuevo.setFitness(c.getFitness());
    		nuevo.setIndividuo(c.getIndividuo());
    		nuevo.setPuntAcumulada(c.getPuntAcumulada());
    		nuevo.calculaFenotipo();
    		break;
    	case "F3":
    		nuevo = new Cromosoma3(this.tolerancia);
    		nuevo.setFitness(c.getFitness());
    		nuevo.setIndividuo(c.getIndividuo());
    		nuevo.setPuntAcumulada(c.getPuntAcumulada());
    		nuevo.calculaFenotipo();
    		break;
    	case "F4":
    		nuevo = new Cromosoma4(this.tolerancia);
    		nuevo.setFitness(c.getFitness());
    		nuevo.setIndividuo(c.getIndividuo());
    		nuevo.setPuntAcumulada(c.getPuntAcumulada());
    		nuevo.calculaFenotipo();
    		break;
    	case "F5":
    		nuevo = new Cromosoma5(this.tolerancia, this.numGenes);
    		nuevo.setFitness(c.getFitness());
    		nuevo.setIndividuo(c.getIndividuo());
    		nuevo.setPuntAcumulada(c.getPuntAcumulada());
    		nuevo.calculaFenotipo();
    		break;
    	}
    	return nuevo;
    }
}
