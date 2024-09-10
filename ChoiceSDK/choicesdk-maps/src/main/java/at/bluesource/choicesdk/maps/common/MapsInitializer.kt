package at.bluesource.choicesdk.maps.common

import android.content.Context
import at.bluesource.choicesdk.core.MobileService
import at.bluesource.choicesdk.core.MobileServicesDetector

class MapsInitializer {

    companion object {
        @JvmStatic
        fun initialize(context: Context) {
            when (MobileServicesDetector.getAvailableMobileService()) {
                MobileService.GMS -> com.google.android.gms.maps.MapsInitializer.initialize(context)
                MobileService.HMS -> {
                    com.huawei.hms.maps.MapsInitializer.initialize(context)
                    com.huawei.hms.maps.MapsInitializer.setApiKey("DQEDAO1RDIyn/7m+s/xUka/sJ822LulwH7xsXXfGIIykR66u/RsAf35HX003nhljH6qlSxoq9FG/G37vpp4M4Hu0AihfW3rq9Wwy1A==")
                    com.huawei.hms.maps.MapsInitializer.setAppId("111881535")
                }
            }
        }
    }

}