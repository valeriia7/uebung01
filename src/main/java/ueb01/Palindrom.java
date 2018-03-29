package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		if(s.length() == 1){ // ob da eine Buchstabe ist?
			return true;
		}

		CharStack stack = new CharStackImpl();

		char[] array = s.toLowerCase().replaceAll(" ","").toCharArray();

		int i = 0;

		// häfte von array

		for(; i < array.length/2 ; i++ ){
			stack.push(array[i]);
		}


		if(array.length % 2 == 1){
			i++;
		}





		//ab häfte array
		for (; i< array.length ; i++){
			if(array[i] != stack.pop()){
				return false;

			}
		}








		return true;
	}
}
