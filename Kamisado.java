/**
 * Created by Dastan21
 */

class Kamisado {
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater( new Runnable() {
      public void run() {
        Model model = new Model();
        ControlGroup control = new ControlGroup(model);
      }
    });
  }
}
