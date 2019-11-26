package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.protos.youtube.api.innertube.SetAppThemeCommandOuterClass$SetAppThemeCommand;
import java.util.Map;

/* renamed from: gzz */
public final class gzz implements aaap {
    private final Activity a;
    private final SharedPreferences b;

    public gzz(Activity activity, SharedPreferences sharedPreferences) {
        this.a = activity;
        this.b = sharedPreferences;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            SetAppThemeCommandOuterClass$SetAppThemeCommand setAppThemeCommandOuterClass$SetAppThemeCommand = (SetAppThemeCommandOuterClass$SetAppThemeCommand) b;
            int a = fmv.a(this.b);
            int a2 = axfw.a(setAppThemeCommandOuterClass$SetAppThemeCommand.b);
            if (a2 == 0) {
                a2 = 1;
            }
            String str = "app_theme_dark";
            if (a2 - 1 == 2) {
                if (a != 2) {
                    this.b.edit().putBoolean(str, true).apply();
                }
                return;
            } else if (a != 1) {
                this.b.edit().putBoolean(str, false).apply();
            } else {
                return;
            }
            this.a.recreate();
            return;
        }
        throw new aabf("Expected a SetAppThemeCommand, but did not find one.");
    }
}
