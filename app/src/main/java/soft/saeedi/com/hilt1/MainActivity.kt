package soft.saeedi.com.hilt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var firstClass: FirstClass;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(firstClass.parentMethod());
        println(firstClass.childMehod())
    }
}

class FirstClass
@Inject
constructor(private val otherClass: OtherClass) {
    fun parentMethod(): String {
        return "from parent";
    }

    fun childMehod(): String {
        return otherClass.childMethod();
    }
}

class OtherClass
@Inject
constructor() {
    fun childMethod(): String {
        return "from child";
    }
}