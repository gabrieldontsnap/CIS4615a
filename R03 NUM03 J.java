public static int getInteger(DataInputStream is) throws IOException {
  returnis.readInt( )  & 0xFFFFFFFFL; // Mask with 32 one−bits
}
