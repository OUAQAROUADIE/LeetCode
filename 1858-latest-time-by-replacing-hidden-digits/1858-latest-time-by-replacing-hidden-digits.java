class Solution {
    public String maximumTime(String time) {
       char[] tab = time.toCharArray();
       if(tab[0] == '?'){
        if(tab[1] < '4' || tab[1] == '?'){
        tab[0] = '2';
        }else{
            tab[0] = '1';
         }
       }
       if(tab[1] == '?'){
        if(tab[0] == '2'){
            tab[1] = '3';
        }
        if(tab[0] == '1' || tab[0] == '0'){
            tab[1] = '9';
        }
       }
       if(tab[3] == '?'){
        tab[3] = '5';
       }
       if(tab[4] == '?'){
        tab[4] = '9';
       }
        
         String result = new String(tab);

            return result;
    }
}

       
    
