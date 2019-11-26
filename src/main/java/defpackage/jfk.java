package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.Set;

/* renamed from: jfk */
public final class jfk extends BroadcastReceiver {
    public final Set a = new zl();

    public jfk() {
        IntentFilter intentFilter = new IntentFilter("com.google.soli.event.swipe");
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action) && action.startsWith("com.google.soli.event.swipe")) {
            int i;
            int i2 = 0;
            int intExtra = intent.getIntExtra("direction", 0);
            int[] iArr = new int[]{1, 2, 3, 5, 9, 17};
            while (i2 < 6) {
                i = iArr[i2];
                int i3 = i - 1;
                if (i != 0) {
                    if (i3 == intExtra) {
                        break;
                    }
                    i2++;
                } else {
                    throw null;
                }
            }
            i = 1;
            if (i != 1) {
                for (jfj a : this.a) {
                    a.a(i);
                }
            }
        }
    }
}
