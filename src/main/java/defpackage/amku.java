package defpackage;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.youtube.api.service.YouTubeService;

/* renamed from: amku */
public final class amku extends amlb {
    private final mma a;
    private final /* synthetic */ YouTubeService b;

    public amku(YouTubeService youTubeService, mma mma) {
        this.b = youTubeService;
        this.a = mma;
    }

    public final void a(amlg amlg, int i, String str, String str2, String str3) {
        amlg amlg2 = amlg;
        String str4 = str;
        if (i >= 1000) {
            YouTubeService youTubeService = this.b;
            int callingUid = Binder.getCallingUid();
            if (!TextUtils.isEmpty(str)) {
                String[] a = qiu.a(youTubeService).a(callingUid);
                if (!(str4 == null || a == null)) {
                    for (Object equals : a) {
                        if (str4.equals(equals)) {
                            boolean z;
                            YouTubeService youTubeService2 = this.b;
                            amkw amkw = new amkw(youTubeService2, youTubeService2.a, str, amlg, this.a);
                            String a2 = ammm.a(i);
                            amqw.a((Object) str2);
                            amqw.a((Object) str3);
                            if (amkw.e.contains(amkw.c)) {
                                z = true;
                            } else {
                                Context context = amkw.a;
                                z = false;
                            }
                            amkw.d.a(amkw, amkw.b, amkw.a, str3, amkw.c, str2, a2, z);
                            return;
                        }
                    }
                }
            }
            YouTubeService.a(amlg2, 2);
            return;
        }
        YouTubeService.a(amlg2, 9);
    }
}
