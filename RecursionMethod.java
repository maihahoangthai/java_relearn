/* Đặc trưng của Hồi quy:
 * gọi x là Argument của hàm hồi quy f().
 * 1. Hàm phải có vòng lập if-else
 * 2. Nếu đúng, return (x + f(x-1))
 * 3. Nếu sai, return một value cụ thể nào đó như 5, 10, 2, 0, v.v. hoặc x
 */
public class RecursionMethod{
    public static void main(String[] args){
        System.out.println(SumCal(5, 10)); // "5" và "10" là Arguments.
    }

    static int SumCal(int start, int end){ // "int start" và "int end" là Parameters.
        if(start < end){
            return end + SumCal(start, end-1);
        }else{
            return end;
        }
    }
}
