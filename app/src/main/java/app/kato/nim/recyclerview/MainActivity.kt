package app.kato.nim.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData: List<CourseData> = listOf(
        CourseData(R.drawable.randy_icon, "Androidアプリプログラミングコース", "色んなアプリを作って、プログラミングを楽しもう！"),
        CourseData(R.drawable.iphone_icon, "iPhoneアプリプログラミングコース", "世界に1つだけのiPhoneアプリをつくって、周りを驚かせよう！"),
        CourseData(R.drawable.unity_icon, "Unityゲームプログラミングコース", "世界を驚かすワクワクが止まらない！3Dゲームを制作しよう！"),
        CourseData(R.drawable.minecraft_icon, "Minecraftプログラミングコース", "マインクラフトでjavaプログラミングを学ぼう！"),
        CourseData(R.drawable.movie_icon, "映像制作コース", "撮影から編集まで、オリジナルの映像作品を作り出そう！"),
        CourseData(R.drawable.anime_icon, "アニメーションコース", "頭の中で描いたストーリーをアニメにしてみよう！"),
        CourseData(R.drawable.maya_icon, "Maya 3DCGコース", "君の想像を3Dで実現しよう！"),
        CourseData(R.drawable.camera_icon, "カメラ＆フォトグラフィーコース", "みんなに一目置かれる写真作品を作れるようになろう！"),
        CourseData(R.drawable.media_icon, "メディアアートプログラミングコース", "映像とプログラミングの融合！メディアアートの世界へ！"),
        CourseData(R.drawable.design_icon, "デザイナーコース", "思い描いたイメージをカタチにできる、一生使える力を身に着けよう！"),
        CourseData(R.drawable.webd_icon, "Webデザインコース", "HTML5,CSS3,JavaScriptで動くオリジナルウェブサイトを作ろう！"),
        CourseData(R.drawable.webs_icon, "Webサービスプログラミングコース", "インターネットの仕組みを学び、Webサービスをリリースしよう！"),
        CourseData(R.drawable.dtm_icon, "デジタルミュージックコース", "今日から君はミュージシャン！その直感を音楽に変えよう！"),
        CourseData(R.drawable.miku_icon, "初音ミク V3コース", "初音ミクにメロディを歌わせよう！")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)


    }
}