package arraylist.implementation;

/* Implementation Of ArrayList*/
public class ArrayList {

    //Default Array:
    private int[] array;

    //Initial Size:
    private static final int DEFAULT_SIZE = 10;

    //Initial Index:
    private int index = 0;

    //Constructor:
    public ArrayList(){
        this.array = new int[DEFAULT_SIZE];
    }

    //Add(int data):
    public void add(int data){

        if(isFull()){
            resize();
        }

        this.array[this.index] = data;
        this.index++;
    }

    //IsFull():
    private boolean isFull() {
        return this.index == this.array.length;
    }

    //Resize():
    private void resize() {

        int[] temp = new int[(int) (array.length * 1.5)];

        for(int i = 0 ; i < array.length ; i++){
            temp[i] = this.array[i];
        }
//        System.arraycopy(array,0,temp,0,array.length);

        this.array = temp;
    }

    //Print():
    public void print() throws Exception{

//        if(isEmpty()){
//            throw new Exception("ArrayList Is Already Empty, Nothing To Print!");
//        }

        for(int i = 0 ; i < this.index ; i++){
            System.out.println(array[i]);
        }

    }

    //Get(int index):
    public int get(int index) throws Exception{

        if(isEmpty()){
            throw new Exception("ArrayList Is Already Empty, Can't Get An Element!");
        }

        if(index < 0 || index > this.index - 1){
            throw new Exception("Index Is Out Of Bound Exception, Nothing To Get!");
        }

        return this.array[index];
    }

    //Set(int index, int data):
    public void set(int index, int data) throws Exception{

        if(isEmpty()){
            throw new Exception("ArrayList Is Already Empty, Can't Set An Element!");
        }

        if(index < 0 || index > this.index - 1){
            throw new Exception("Index Is Out Of Bound Exception, Nothing To Set!");
        }

        this.array[index] = data;
    }

    //Size():
    public int size(){
        return this.index;
    }

    //Contains(int data):
    public boolean contains(int data) throws Exception{

        if(isEmpty()){
            throw new Exception("ArrayList Is Already Empty!");
        }

        for(int element: this.array){
            if(element == data){
                return true;
            }
        }
        return false;
    }

    //IsEmpty():
    public boolean isEmpty(){
        return this.index <= 0;
    }

    //Clear():
    public boolean clear(){
        this.array = null;
        return false;
    }

    //Remove():
    public int remove()throws Exception{

        if(isEmpty()){
            throw new Exception("ArrayList Is Already Empty, Nothing To Remove!");
        }

        int removed = this.array[this.index - 1];
        this.index--;
        return removed;
    }

    //Remove(int index):
    public int remove(int index) throws Exception{

        if(isEmpty()){
            throw new Exception("ArrayList Is Already Empty, Nothing To Remove!");
        }

        if(index < 0 || index > this.index - 1){
            throw new Exception("Index Is Out Of Bound Exception, Nothing To Remove!");
        }

        int[] tempArray = new int[this.index - 1];
        int j = 0;
        int removed = Integer.MIN_VALUE;
        int tempIndex = this.index;

        for(int i = 0 ; i < this.index; i++){
            if(i == index){
                removed = this.array[i];
                tempIndex--;
            }
            else{
                tempArray[j] = this.array[i];
                j++;
            }
        }

        this.array = tempArray;
        this.index = tempIndex;
        return removed;
    }

    //ToArray():
    public int[] toArray() throws Exception{

        if(isEmpty()){
            throw new Exception("ArrayList Is Already Empty!");
        }

        int[] tempArray = new int[this.index];

        for(int i = 0 ; i < this.index ; i++){
            tempArray[i] = this.array[i];
        }

        return tempArray;
    }

    //IndexOf(int data):
    public int indexOf(int data) throws Exception{

        if(isEmpty()){
            throw new Exception("ArrayList Is Already Empty, Nothing To Return!");
        }

        for(int i = 0 ; i < this.index; i++){
            if(array[i] == data){
                return i;
            }
        }

        return -1;
    }

}
