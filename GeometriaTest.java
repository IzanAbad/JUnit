package junit.junitGeometria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {

	@Test
	public void cuadrado() {
        Geometria cuadrado = new Geometria(1);
        int resultado = cuadrado.areacuadrado(5);
        int esperado = 25;
        assertEquals(esperado, resultado);
    }
	@Test
	public void circulo() {
		Geometria circulo = new Geometria(2);
		double resultado = circulo.areaCirculo(5);
		int delta = 1;
		int esperado = 78;
		assertEquals(esperado, resultado,delta);
	}
	@Test
	public void triangulo() {
		Geometria triangulo = new Geometria(3);
		int resultado = triangulo.areatriangulo(5, 5);
		int esperado = 12;
		assertEquals(esperado, resultado);
	}
	@Test
	public void rectangulo() {
		Geometria rectangulo = new Geometria(4);
		int resultado = rectangulo.arearectangulo(5, 5);
		double esperado = 25;
		assertEquals(esperado, resultado);
	}
	@Test
	public void romboide() {
		Geometria romboide = new Geometria(7);
		int resultado = romboide.arearomboide(5, 5);
		double esperado = 25;
		assertEquals(esperado, resultado);
	}
	@Test
	public void pentagono() {
		Geometria pentagono = new Geometria(5);
		int resultado = pentagono.areapentagono(5, 5);
		double esperado = 12;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}
	@Test
	public void rombo() {
		Geometria rombo = new Geometria(6);
		int resultado = rombo.arearombo(5, 5);
		double esperado = 12;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}
	@Test
	public void trapecio() {
		Geometria trapecio = new Geometria(8);
		int resultado = trapecio.areatrapecio(5, 5, 5);
		double esperado = 25;
		int delta = 1;
		
		trapecio.getId();
		trapecio.getNom();
		trapecio.getArea();
		trapecio.toString();
		
		assertEquals(esperado, resultado, delta);
	}
	@Test
	public void cuadrado_2() {
		Geometria cuadrado2 = new Geometria();
		int resultado = cuadrado2.areacuadrado(5);
		double esperado = 25;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}
	@Test
	public void cuadrado_3() {
		Geometria cuadrado2 = new Geometria(9);
		int resultado = cuadrado2.areacuadrado(5);
		double esperado = 25;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}
	@Test
	public void cuadrado_4() {
		Geometria cuadrado = new Geometria();
		cuadrado.setId(1);
		cuadrado.setNom("Cuadrado");
		cuadrado.setArea(25);
		
		
	}
	

}
