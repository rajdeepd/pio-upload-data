import org.apache.http.client.methods.{HttpDelete, HttpGet, HttpPatch, HttpPost}
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.{BasicResponseHandler}
import com.typesafe.config._
import org.apache.http.impl.client.HttpClientBuilder

object UploadData {
  var count = 0;

  //val ACCESS_KEY = "kJirDFkDpa7GvaU0wLfgWU5T4WqTOX1hmjMNwWozSoBciT39ZaTVR0BHTvoqA-48"
  //val HOST = "localhost:7070"


  val conf = ConfigFactory.load()
  val ACCESS_KEY = conf.getString("pio.access_token")
  val HOST = conf.getString("pio.host")
  val url= "http://"+ HOST + "/events.json?accessKey="+ ACCESS_KEY

  def uploadJson(json : String) = {
    try {
      val client = HttpClientBuilder.create().build()
      val post = new HttpPost(url)
      post.setHeader("Content-type", "application/json")
      val jsonData = json
      post.setEntity(new StringEntity(jsonData))
      val response = client.execute(post)
      println(response)
      count += 1
      println(count)
    }finally {

    }
  }

  def readFile(filePath : String) : List[String] = {
    import scala.io.Source
    import scala.collection.mutable.ListBuffer
    var lines = new ListBuffer[String]()
    for(line <- Source.fromFile("").getLines()) {
      println(line)
      lines.+=(line)
    }
    return lines.toList
  }
}