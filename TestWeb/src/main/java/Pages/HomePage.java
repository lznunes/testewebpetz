package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public  WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		driver = new ChromeDriver();
		this.driver = driver;
	}
	
	public void localizProdutos(String produto) {
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys(Keys.chord(produto));
		driver.findElement(By.cssSelector(".button-search")).click();
	}
	
	public void clicanoProduto3() {
		driver.findElement(By.cssSelector(".liProduct:nth-child(3) .nome_produto")).click();
	}
	
	public String descricaoProduto() {
		String  produto = driver.findElement(By.cssSelector("h1")).getText();
		return produto + " ";
	}
	
	public String fornecedorProduto() {
		String  fornecedor = driver.findElement(By.cssSelector(".col-md-6:nth-child(3)")).getText();
		return fornecedor;
	}
	
	public String preconormalProduto() {	
		String  preconormal = driver.findElement(By.cssSelector(".price-current")).getText();
		return preconormal;
	}
	
	public String precoassinanteProduto() {
		String  precoparaassinante = driver.findElement(By.cssSelector(".price-subscriber")).getText();
		return precoparaassinante;
	}
	
	public void clicaAdicionarCarrinho() {
		driver.findElement(By.id("adicionarAoCarrinho")).click();
	}
	
	public String descricaoProdutoCarrinho() {
		String resumo[] = driver.findElement(By.cssSelector(".td-resumo")).getText().split("-");
		String descricaoproduto = resumo[0];
		return descricaoproduto;
	}
	
	public String precoProdutoCarrinho() {
		String preco  = driver.findElement(By.cssSelector("tbody .preco")).getText();
		return preco;
	}
	
	public void limpacarrinho() {
		driver.findElement(By.cssSelector(".minus-button-carrinho")).click();
	}
	
	public void carregasite() {
		driver.get("https://www.petz.com.br");
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
	}
	
	public String obterTitulo() {
		String title = driver.getTitle();
		return title;
	}

}
