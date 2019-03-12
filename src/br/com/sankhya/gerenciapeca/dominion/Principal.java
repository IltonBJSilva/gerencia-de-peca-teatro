package br.com.sankhya.gerenciapeca.dominion;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataHoje = formatador.parse(formatador.format(new Date()));
		Date dataAfrente = formatador.parse(formatador.format(new Date(dataHoje.getTime() + (9728 * 100000))));
		BigDecimal salario = new BigDecimal(200);
		BigDecimal acrescimoLeia = new BigDecimal(300);
		BigDecimal acrescimoFilhaLeia = new BigDecimal(300);
		//PEÇA 1
		Peca peca1 = new Peca(1, "Star Wars", 150, dataAfrente);
		Ator ator1 = new Ator(1, "Cashier fish", "EUA", salario);
		Papel papel1 = new Papel(1,"Princessa Leia", acrescimoLeia);
		Papel papel12 = new Papel(1,"Filha Princessa Leia", acrescimoFilhaLeia);
		//PEÇA 2
		Peca peca2 = new Peca(2, "Moana", 150, dataAfrente);
		Ator ator2 = new Ator(2, "Eliana Casto", "Motunui", salario);
		Papel papel2 = new Papel(2,"Moana", new BigDecimal(200));
		Papel papel22 = new Papel(2,"Mae Moana", new BigDecimal(300));
		//PEÇA 3
		Peca peca3 = new Peca(3, "Harry Potter", 150, dataAfrente);
		Ator ator3 = new Ator(3, "Daniel Radcliver", "Canada", salario);
		Papel papel3 = new Papel(3,"Harry Potter", new BigDecimal(1000));
		Papel papel23 = new Papel(3,"Clone do harry", new BigDecimal(500));
		//PEÇA 4
		Peca peca4 = new Peca(3, "CBOS", 150, dataAfrente);
		Ator ator4 = new Ator(3, "Ilton Batista", "Brasil", salario);
		Papel papel4 = new Papel(3,"Hackear BO", new BigDecimal(4000));
		Papel papel24 = new Papel(3,"Semi Hackear BO", new BigDecimal(9000));
		
		//PEÇA 1
		peca1.getPapeis().addAll(Arrays.asList(papel1,papel12));
		//fala que o papel pertece a a tal peca
		papel1.setPeca(peca1);
		papel12.setPeca(peca1);
		//fala que o papel pertece a tal ator
		papel1.setAtor(ator1);
		papel12.setAtor(ator1);
		//fala que o ator possui tais peças
		ator1.getPapeis().addAll(Arrays.asList(papel1,papel12));
		//FIM
		
		//PEÇA 2
		peca2.getPapeis().addAll(Arrays.asList(papel2,papel22));
		//fala que o papel pertece a a tal peca
		papel2.setPeca(peca2);
		papel22.setPeca(peca2);
		//fala que o papel pertece a tal ator
		papel2.setAtor(ator2);
		papel22.setAtor(ator2);
		//fala que o ator possui tais peças
		ator2.getPapeis().addAll(Arrays.asList(papel2,papel22));
		//FIM
		
		//PEÇA 3
		peca3.getPapeis().addAll(Arrays.asList(papel3,papel23));
		//fala que o papel pertece a a tal peca
		papel3.setPeca(peca3);
		papel23.setPeca(peca3);
		//fala que o papel pertece a tal ator
		papel3.setAtor(ator3);
		papel23.setAtor(ator3);
		//fala que o ator possui tais peças
		ator3.getPapeis().addAll(Arrays.asList(papel3,papel23));
		//FIM
		
		//PEÇA 3
		peca4.getPapeis().addAll(Arrays.asList(papel4,papel24));
		//fala que o papel pertece a a tal peca
		papel4.setPeca(peca4);
		papel24.setPeca(peca4);
		//fala que o papel pertece a tal ator
		papel4.setAtor(ator4);
		papel24.setAtor(ator4);
		//fala que o ator possui tais peças
		ator3.getPapeis().addAll(Arrays.asList(papel4,papel24));
		//FIM
		
		//PRIMEIRO
		System.out.println("\n\n--------------PRIMEIRA PEÇA---------------------\n\n");
		System.out.println(peca1);
		System.out.println(ator1);
		System.out.println(papel1);
		System.out.println(papel12);
		System.out.println("\n\n");
		System.out.println("Custo Total: "+peca1.exibirCustoTotal()+"\n\n");
		System.out.println("Salario com acrescimo: "+papel1.exibirSalarioComAcrescimo());
		//SEGUNDO
		System.out.println("\n\n--------------SEGUNDA PEÇA---------------------\n\n");
		System.out.println(peca2);
		System.out.println(ator2);
		System.out.println(papel2);
		System.out.println(papel22);
		System.out.println("\n\n");
		System.out.println("Custo Total: "+peca2.exibirCustoTotal()+"\n\n");
		System.out.println("Salario com acrescimo: "+papel2.exibirSalarioComAcrescimo());
		//TERCEIRO
		System.out.println("\n\n--------------TERCEIRA PEÇA---------------------\n\n");
		System.out.println(peca3);
		System.out.println(ator3);
		System.out.println(papel3);
		System.out.println(papel23);
		System.out.println("\n\n");
		System.out.println("Custo Total: "+peca3.exibirCustoTotal()+"\n\n");
		System.out.println("Salario com acrescimo: "+papel3.exibirSalarioComAcrescimo());
		//TERCEIRO
		System.out.println("\n\n--------------QUARTA PEÇA---------------------\n\n");
		System.out.println(peca4);
		System.out.println(ator4);
		System.out.println(papel4);
		System.out.println(papel24);
		System.out.println("\n\n");
		System.out.println("Custo Total: "+peca4.exibirCustoTotal()+"\n\n");
		System.out.println("Salario com acrescimo: "+papel4.exibirSalarioComAcrescimo());
	}
}