package defpackage;

import android.database.Cursor;

/* renamed from: agen */
public final class agen {
    public final agfd a;

    public agen(agfd agfd) {
        this.a = (agfd) amqw.a((Object) agfd);
    }

    public final boolean a(String str) {
        boolean z = true;
        Cursor query = this.a.a().query("adbreaks", new String[]{"original_video_id"}, "original_video_id=?", new String[]{str}, null, null, null, null);
        try {
            if (query.getCount() <= 0) {
                z = false;
            }
            query.close();
            return z;
        } catch (Throwable th) {
            query.close();
        }
    }
}
