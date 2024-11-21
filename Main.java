public int countSubstring(String str,String sub){
    int count = 0;
    int index = 0;
    while (index >= 0){
        index = str.indexOf(sub,index);
        if(index >= 0){
            count++;
            index += sub.length();
        }
    }
    return count;
}