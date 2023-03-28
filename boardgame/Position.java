package boardgame;

public class Position{
  private int rows;
  private int collumns;
  
  public Position(int rows, int collumns) {
    this.rows = rows;
    this.collumns = collumns;
  }

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getCollumns() {
    return collumns;
  }

  public void setCollumns(int collumns) {
    this.collumns = collumns;
  }
  @Override
  public String toString(){
    return rows + ", " + collumns;
  }
  

}