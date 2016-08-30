/**
  * Created by ubuntu on 30/8/16.
  */
object UploadEmails {

  def main(args: Array[String]) = {
    val PATH = "./data/emails.json";
    println("Upload emails from: " + PATH)
    val lines = UploadData.readFile(PATH);
    lines.foreach(l => UploadData.uploadJson(l))
    println("Completed uploads")
  }
}
