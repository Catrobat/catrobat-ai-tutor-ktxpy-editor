package github.psicodes.ktxpy

import com.google.android.material.color.DynamicColors
import org.catrobat.aitutor.AiTutorInitializer

class Application : android.app.Application() {
    override fun onCreate() {
        super.onCreate()
        AiTutorInitializer.init(context = this, geminiApiKey = getString(R.string.gemini_api_key))
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}