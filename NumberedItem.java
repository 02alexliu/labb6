import java.util.*; 


public class NumberedItem<T> implements Comparable<NumberedItem<T>>{
    public int index;
    public T type;
    
    
    NumberedItem(int inputindex, T generic){
        if(inputindex<0){
            this.index = 0;
        }else{
            this.index = inputindex;
        }
        this.type = generic;
    }

    public String toString(){ 
        String out = "Index: ";
        out += Integer.toString(index);
        out += " Value: ";
        try{
            out += type;
        }catch(Exception e){
            out += "None";
        }
        return out;
    }

    
    public int compareTo(NumberedItem<T> comparisonObject){ // self.index - comparisonObject.index
        try{
            
            return this.index - comparisonObject.index;

        } catch(Exception e){
            System.out.println("Only integers can be compared");
        }
        return 0;
    }

    public boolean equals(NumberedItem<T> comparisonObject){
        if (comparisonObject == null)
            return false;

        if (comparisonObject.type instanceof String || type instanceof String){
            if (comparisonObject.type instanceof String && type instanceof String){
                if (comparisonObject.type.equals(type)){
                    return true;
                }
            }
            return false;
        } 
        else{
            try{
                if (comparisonObject.type == type)
                    return true;
            } catch(Exception e){
            }
            try{
                if (type.equals(comparisonObject.type))
                    return true;
            } catch(Exception e){
            }
            
        }
        return false;
        
    }

}

