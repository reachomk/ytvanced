package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ContextThemeWrapper;
import com.google.android.youtube.R;

/* renamed from: gbe */
public final class gbe implements akvz {
    private final akpb a = new aknw();

    public gbe(Context context, SharedPreferences sharedPreferences, akkq akkq) {
        ContextThemeWrapper contextThemeWrapper;
        if (fmv.a(sharedPreferences) == 2) {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.f599UserMentionSearchView.Dark);
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.f600UserMentionSearchView.Light);
        }
        this.a.a(aywd.class, new akpa(new gbd(contextThemeWrapper, akkq)));
    }

    public final void a(Class cls) {
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
