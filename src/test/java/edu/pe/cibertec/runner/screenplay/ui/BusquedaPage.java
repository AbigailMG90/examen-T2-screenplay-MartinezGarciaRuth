package edu.pe.cibertec.runner.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaPage {
    public static final Target SEARCH_INPUT = Target.the("barra de búsqueda").located(By.name("search"));
    public static final Target NO_RESULTS_MESSAGE = Target.the("mensaje sin resultados").located(By.xpath("//div[@id='content']/p[2]"));
}