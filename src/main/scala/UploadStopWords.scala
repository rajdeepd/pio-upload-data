import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.DefaultHttpClient

object UploadStopWords {
  def main(args: Array[String]) = {
    val currentDir = System.getProperty("user.dir")
    val PATH = currentDir + "/data/stopwords.json";
    println(PATH)

    val lines = UploadData.readFile(PATH);
    lines.foreach(l => UploadData.uploadJson(l))
  }
}