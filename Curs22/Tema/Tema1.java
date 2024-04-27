package Curs22.Tema;

 class Tema1 {


            public boolean Tema1(String S) {
                boolean hasB=false;

                for(char readValue:S.toCharArray()){
                    if(readValue == 'b'){
                        hasB=true;
                    }else if(readValue=='a'&&hasB){
                        return false;
                    }
                }
                return true;
            }

        }


