import java.util.Scanner;


public class ToDoList {
	public static int curentPageList = 0;
	public static int iValues = 1;
	public static int iMax = 4;
	public static Scanner input = new Scanner(System.in);
	public static String[] DataList = new String[8+1];//Default 8
	
	//Main Metod
	public static void main(String[] args) {
		DataList[1] = "test";
		DataList[2] = "test";
		DataList[3] = "test";
		DataList[4] = "test";
		DataList[5] = "test";
		DataList[6] = "test";
		DataList[7] = "test";
		DataList[8] = "test";
		//DataList[9] = "test";
//		DataList[10] = "test";
//		DataList[11] = "test";
		checkDataList();
		while (true) {
		    mainMenu();
		    var DataListCommand = input.nextLine();
		    
		    if (DataListCommand.equals("Next") || DataListCommand.equals("1")) {
		        nextDataListPage();
		    } else if (DataListCommand.equals("Back") || DataListCommand.equals("2")) {
		        BackDataListPage();
		    } else if (DataListCommand.equals("Add") || DataListCommand.equals("3")) {
		        addDataList();
		    } else if (DataListCommand.equals("Extend") || DataListCommand.equals("4")) {
		        extendDataList();
		    } else if (DataListCommand.equals("Reamove") || DataListCommand.equals("5")) {
		        reamoveDataList();
		    } else if (DataListCommand.equals("Change") || DataListCommand.equals("6")) {
		        changeDataList();
		    } else if (DataListCommand.equals("Exit") || DataListCommand.equals("X")) {
		        break;
		    }
		    
		    
		    
		    System.out.println("\033[H\033[2J");
		    
		} // while true loop
	} // end blok main metod
	
	/**
	Metod CallMenu
==== [ TODOLIST ] =====
array[1]. array[1]
array[2]. Array[2]
array[3]. Array[3]
array[4]. Array[4]
[ 8 MORE LIST ] 
==== [ COMMAND ] ====
[ Next ] Next Page 
[ Back ] Back Page
[ Add ] Add New ToDoList
[ Reamove ] Delate Data ToDoList
[ Change ] Change Data ToDoList
====================
	*/
	public static void  mainMenu() {
		    
	    System.out.println("==== [ TODOLIST ] ====");
	    int i;
	    for (i = iValues; i <= iMax ; i++) {
	        System.out.println(i + ". " + DataList[i]+ ".");
	    }
	    System.out.println("[ " + curentPageList + " ]" + "More list In Next Page");
	    System.out.println("===== [ COMMAND ] =====");
	    System.out.println("[ Next ] OR [ 1 ] Next Page ");
	    System.out.println("[ Back ] OR [ 2 ] Back Page");
	    System.out.println("[ Add ] OR [ 3 ] Add New");
	    System.out.println("[ Extend ] OR [ 4 ] Extend Index List");
	    System.out.println("[ Reamove ] OR [ 5 ] Delate Data ToDoList");
	    System.out.println("[ Change ] OR [ 6 ]  Change Data ToDoList");
	    System.out.println("[ Exit ] OR [ X ] To Exit Program");
	    System.out.println("=======================");
	    System.out.print("[ ~ ] ");
	    
	} // end blok mainMenu
	
	//Metod NextArray
	public static void nextDataListPage() {
	    iValues +=4;
	    iMax +=4;
	    if (iValues >= (DataList.length -1 ) && iMax >= (DataList.length -1 )) {
	        iValues = DataList.length -4;
	        iMax = DataList.length -1;
	    }
	    
	    curentPageList -= 4;
	    if  (curentPageList < 0) {
	        curentPageList = 0;
	    }
	} // end blok nextDataListPage
	
	public static void BackDataListPage(){
	    int counter = 0;
	    for (int i = iValues ; i <= iMax ; i++) {
	        if (DataList[i] != null) {
	            counter++;
	            System.out.println(DataList[i]);
	        }
	    }
	   curentPageList += counter;
	    iValues -= 4;
	    iMax -= 4;
	    if (iValues <= 0 && iMax <= 0) {
	        iValues = 1;
	        iMax = 4;
	    }
	    if (iValues == 1 && iMax == 4)
	    curentPageList = checkDataList();
	}
	
	//Metod Add New DataTo Arrray
	public static void addDataList() {
	    //input
	    System.out.print("[ + ] Enter Data: ");
	    String DataListAdd = input.nextLine();
	    if (DataListAdd.equals("null")) {
	        return;
	    }
	    // page 
	    boolean found = false;
	    for(int i = iValues; i <= iMax; i++) {
	        if (DataList[i] == null) {
	            found = false;
	        } else if (DataList[i] != null) {
	            found = true;
	        }
	    }
	    
	    if (found) {
	        curentPageList++;
	    } else {
	        curentPageList = 0;
	    }
	    if ((DataList.length - 1) == iMax) {
	        curentPageList = 0;
	    }
	    //menambahkan data
	    
	    for (int i = 1; i <= (DataList.length -1) ; i++) {
	        if (DataList[i] == null) {
	            DataList[i] = DataListAdd;
	            break;
	        }
	    }
	} // end blok addDataList
	
	//not done
	public static void extendDataList() {
	    System.out.print("[ + ] Extend Amount: ");
	    int Amount = input.nextInt();
	    if (Amount < 0 ) {
	        return;
	    }
	    String saveDataList[] = DataList;
	    DataList = new String[DataList.length + Amount];
	    for (int i = 0 ; i < saveDataList.length ; i++) {
	        DataList[i] = saveDataList[i];
	    }
	}
	//Metod Delate Data From Array 
	public static void reamoveDataList() {
	    System.out.print("[ + ] Number ToDoList ToReamove:  ");
	    int Number = input.nextInt();
	    if (Number < 0 ) {
	        return;
	    }
	    DataList[Number] = null;
	} // blok reamoveDataList
	
	//Metod Change DataList
	public static void changeDataList() {
	    System.out.print("[ + ] Number ToDoList ToChange: ");
	    int Number = input.nextInt();
	    if (Number < 0) {
	        return;
	    }
	    System.out.print("[ ^ ] Change Text To: ");
	    input.nextLine();
	    String Text = input.nextLine();
	    DataList[Number] = Text;
	} // end blok changeDataList
	
	// ^ MAIN FUCTION ^
	
	
	//SECONDARY METODH
	
	public static int checkDataList() {
	    int counter = 0;
	    
	    for (int i =1 ; i <= (DataList.length - 1) ; i++) {
	        if (DataList[i] != null) {
	            counter++;
	        }
	    }
	    //System.out.println(counter);
	    counter -= 4;
	    if (counter < 0) {
	        counter = 0;
	    }
	    curentPageList = counter;
	    return curentPageList;
	}
} // end blok main classes