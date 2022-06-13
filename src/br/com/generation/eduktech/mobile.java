package mobile;
import javax.swing.JOptionPane;
 public class mobile {
	

void mobile (int mobile) {
	 int numero;
	 JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile <-----");
	JOptionPane.showMessageDialog(null, "Digite qual tipo de curso você vai acessar de mobile: 1 para: Kotlin Android Studio 2 para: Swift iOS 3 para: Python: o camaleão das linguagens");
	numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero inteiro: "));
	
	if (numero == 1) {
		JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile para Kotlin Android Studio<-----");
		JOptionPane.showMessageDialog(null, "Utilizada especialmente para o desenvolvimento de Androids, o Kotlin foi criado em 2011 pela JetBrain, empresa tcheca que desenvolve softwares. ");
				JOptionPane.showMessageDialog (null,"O insight partiu da necessidade de criar outras funcionalidades e cobrir hiatos da linguagem Java, que até então era o personagem principal desse processo.");
				JOptionPane.showMessageDialog(null,"O mais legal é que o Kotlin é interoperável e pode ser usado em projetos Java. Ele também é open source, multiparadigma, estaticamente tipado, orientado a objetos e ainda conta com características de uma linguagem funcional."); 
				JOptionPane.showMessageDialog(null,"Para mais acesso entre na pagina: https://stefanini.com/pt-br/carreiras/blog-carreiras/artigos/linguagens-de-desenvolvimento-mobile");
	} else if (numero == 2) {
		JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile para Swift iOS<-----");
		
		JOptionPane.showMessageDialog(null, "Já o Swift é o queridinho dos aplicativos iOS. Foi lançado pela Apple em 2014 para democratizar e descomplicar a programação de seus dispositivos, que antes era feita somente pelo Objective-C.");
				JOptionPane.showMessageDialog(null,"E se o intuito era tornar essa linguagem acessível, é claro que ela seria de código aberto!"); 
				JOptionPane.showMessageDialog(null, "Falando em características, o Swift é interativo e sua sintaxe é bem concisa, assim como o Kotlin. Ele também possui vários recursos e se integra com as linguagens Python, Rust e Ruby, o que diverte os desenvolvedores.");
				JOptionPane.showMessageDialog(null, "Para mais Acesso entre na página: https://stefanini.com/pt-br/carreiras/blog-carreiras/artigos/linguagens-de-desenvolvimento-mobile");
	} else if (numero == 3) {
		JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Mobile para Python: o camaleão das linguagens<-----");
		JOptionPane.showMessageDialog(null,"Criada por Guido van Rossum entre os anos 80 e 90, o Phyton nasceu para otimizar a leitura de códigos e valorizar o esforço humano.");
		JOptionPane.showMessageDialog(null,"Por ser intuitivo, o seu uso se expandiu para áreas além da programação, como exatas, engenharia e ciência de dados. Tanto que essa linguagem é bem comum em processos de machine learning, big data e data science.");
		JOptionPane.showMessageDialog(null,"Até pouco tempo atrás, o Phyton não era muito utilizado para desenvolvimento mobile. No entanto, esse cenário mudou quando ele se provou mais conciso e ágil em relação à linguagem Java, C e PHP. Seus scripts de automação também são bem mais rápidos de fazer.");
		JOptionPane.showMessageDialog(null,"Para mais Acesso entre na página: https://stefanini.com/pt-br/carreiras/blog-carreiras/artigos/linguagens-de-desenvolvimento-mobile");
  } else {
	  JOptionPane.showMessageDialog(null,"Numero invalido por favor coloque de 1 até 3 somente! ");
  }
 }
}
