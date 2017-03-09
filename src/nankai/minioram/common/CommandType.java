package nankai.minioram.common;

public interface CommandType {

	public static byte initORAM=1; 
	public static byte readBlock=2; 
	public static byte writeBlock=3; 
	public static byte backData=8;//the other cloud sends back the shuffled data
	public static byte testTime=112;//the other cloud sends back the shuffled data
	public static byte closeThread=111; 
	public static byte openDB=113;//the other cloud sends back the shuffled data
}
