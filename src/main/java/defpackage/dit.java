package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.apps.youtube.app.YouTubeApplication;

/* renamed from: dit */
public final class dit implements baqa {
    public static ContentResolver a(Context context) {
        return (ContentResolver) baqd.a(((YouTubeApplication) context).d().s(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* bridge */ /* synthetic */ Object get() {
        throw null;
    }
}
