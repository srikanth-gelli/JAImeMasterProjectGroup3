import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.jaimegroup3.uiclasses.WelcomePage
import com.example.jaimegroup3.uiclasses.calenderEntry
import com.example.jaimegroup3.uiclasses.driveAround
import com.example.jaimegroup3.uiclasses.findFetch


@Suppress("DEPRECATION")
class MyAdapter (
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                WelcomePage()
            }
            1 -> {
                driveAround()
            }
            2 -> {
                findFetch()
            }
            3 -> {
                calenderEntry()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}