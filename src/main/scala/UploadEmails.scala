import java.io.File

/**
  * Created by Rajdeep Dua on 30/8/16.
  */
object UploadEmails {

  def main(args: Array[String]) = {
    val S = File.separator
    val PATH = "." + S + "data" + S + "emails_100.json";
    println("Upload emails from: " + PATH)
    val lines = UploadData.readFile(PATH);
    lines.foreach(l => UploadData.uploadJson(l))
    println("Completed uploads")
  }
}
