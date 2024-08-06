 class ReplaceString {
    public static void main(String[] args) {
        String str="This is a java";
        String str1[]=str.split("//s+");
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i].equalsIgnoreCase("string"))
            {
                str1[i]="java";
            }
        }
        String newstr=" ";
        for(int i=0;i<str1.length;i++)
        {
            newstr=newstr+str1[i]+" ";
        }
        System.out.println(newstr);
        //str=newstr;
        //System.out.println(str);
    }
    
}
