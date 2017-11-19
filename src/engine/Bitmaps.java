package src.engine;

public class Bitmaps {
	public static long COLUMN_A=72340172838076673L;
	public static long COLUMN_H=-9187201950435737472L;
	public static long COLUMN_AB=217020518514230019L;
	public static long COLUMN_GH=-4557430888798830400L;
	public static long ROW_1=-72057594037927936L;
	public static long ROW_4=1095216660480L;
	public static long ROW_5=4278190080L;
	public static long ROW_8=255L;
	public static long CENTER=103481868288L;
	public static long EXTENDED_CENTER=66229406269440L;
	public static long KING_SIDE=-1085102592571150096L;
	public static long QUEEN_SIDE=1085102592571150095L;
	public static long KING_SPAN=460039L;
	public static long KNIGHT_SPAN=43234889994L;
    public static long EP=0;

	public static long ROW_MASKS[] = /*from row1 to row8*/
		{
				0xFFL, 0xFF00L, 0xFF0000L, 0xFF000000L, 0xFF00000000L, 0xFF0000000000L, 0xFF000000000000L, 0xFF00000000000000L
		};
	public static long COLUMN_MASKS[] = /*from fileA to FileH*/
		{
				0x101010101010101L, 0x202020202020202L, 0x404040404040404L, 0x808080808080808L,
				0x1010101010101010L, 0x2020202020202020L, 0x4040404040404040L, 0x8080808080808080L
		};
	public static long DIAGONAL_MASKS[] =/*from top left to bottom right*/
		{
				0x1L, 0x102L, 0x10204L, 0x1020408L, 0x102040810L, 0x10204081020L, 0x1020408102040L,
				0x102040810204080L, 0x204081020408000L, 0x408102040800000L, 0x810204080000000L,
				0x1020408000000000L, 0x2040800000000000L, 0x4080000000000000L, 0x8000000000000000L
		};
	public static long DIAGONAL2_MASKS[] =/*from top right to bottom left*/
		{
				0x80L, 0x8040L, 0x804020L, 0x80402010L, 0x8040201008L, 0x804020100804L, 0x80402010080402L,
				0x8040201008040201L, 0x4020100804020100L, 0x2010080402010000L, 0x1008040201000000L,
				0x804020100000000L, 0x402010000000000L, 0x201000000000000L, 0x100000000000000L
		};

}