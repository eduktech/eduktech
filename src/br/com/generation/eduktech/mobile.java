package mobile;
import javax.swing.JOptionPane;
 public class mobile {
	

void mobile (int mobile) {
	 int numero;
	 JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile <-----");
	JOptionPane.showMessageDialog(null, "Digite qual tipo de curso voc� vai acessar de mobile: 1 para: Kotlin Android Studio 2 para: Swift iOS 3 para: Python: o camale�o das linguagens");
	numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero inteiro: "));
	
	if (numero == 1) {
		JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile para Kotlin Android Studio<-----");
		JOptionPane.showMessageDialog(null, "Utilizada especialmente para o desenvolvimento de Androids, o Kotlin foi criado em 2011 pela JetBrain, empresa tcheca que desenvolve softwares. ");
				JOptionPane.showMessageDialog (null,"O insight partiu da necessidade de criar outras funcionalidades e cobrir hiatos da linguagem Java, que at� ent�o era o personagem principal desse processo.");
				JOptionPane.showMessageDialog(null,"O mais legal � que o Kotlin � interoper�vel e pode ser usado em projetos Java. Ele tamb�m � open source, multiparadigma, estaticamente tipado, orientado a objetos e ainda conta com caracter�sticas de uma linguagem funcional."); 
				JOptionPane.showMessageDialog(null,"Para mais acesso entre na pagina: https://stefanini.com/pt-br/carreiras/blog-carreiras/artigos/linguagens-de-desenvolvimento-mobile");
	} else if (numero == 2) {
		JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile para Swift iOS<-----");
		
		JOptionPane.showMessageDialog(null, "J� o Swift � o queridinho dos aplicativos iOS. Foi lan�ado pela Apple em 2014 para democratizar e descomplicar a programa��o de seus dispositivos, que antes era feita somente pelo Objective-C.");
				JOptionPane.showMessageDialog(null,"E se o intuito era tornar essa linguagem acess�vel, � claro que ela seria de c�digo aberto!"); 
				JOptionPane.showMessageDialog(null, "Falando em caracter�sticas, o Swift � interativo e sua sintaxe � bem concisa, assim como o Kotlin. Ele tamb�m possui v�rios recursos e se integra com as linguagens Python, Rust e Ruby, o que diverte os desenvolvedores.");
				JOptionPane.showMessageDialog(null, "Para mais Acesso entre na p�gina: https://stefanini.com/pt-br/carreiras/blog-carreiras/artigos/linguagens-de-desenvolvimento-mobile");
	} else if (numero == 3) {
		JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile para Python: o camale�o das linguagens<-----");
		JOptionPane.showMessageDialog(null,"Criada por Guido van Rossum entre os anos 80 e 90, o Phyton nasceu para otimizar a leitura de c�digos e valorizar o esfor�o humano.");
		JOptionPane.showMessageDialog(null,"Por ser intuitivo, o seu uso se expandiu para �reas al�m da programa��o, como exatas, engenharia e ci�ncia de dados. Tanto que essa linguagem � bem comum em processos de machine learning, big data e data science.");
		JOptionPane.showMessageDialog(null,"At� pouco tempo atr�s, o Phyton n�o era muito utilizado para desenvolvimento mobile. No entanto, esse cen�rio mudou quando ele se provou mais conciso e �gil em rela��o � linguagem Java, C e PHP. Seus scripts de automa��o tamb�m s�o bem mais r�pidos de fazer.");
		JOptionPane.showMessageDialog(null,"Para mais Acesso entre na p�gina: https://stefanini.com/pt-br/carreiras/blog-carreiras/artigos/linguagens-de-desenvolvimento-mobile");
  } else {
	  JOptionPane.showMessageDialog(null,"Numero invalido por favor coloque de 1 at� 3 somente! ");
  }
 }
}
