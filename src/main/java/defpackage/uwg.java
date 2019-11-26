package defpackage;

import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.HashMap;
import java.util.Map;

/* renamed from: uwg */
final class uwg extends aldf {
    private final uwm e;
    private final uum f;
    private final boolean g;
    private final aaas h;

    public uwg(SwitchPreference switchPreference, alcs alcs, aldg aldg, axgk axgk, uwm uwm, uum uum, aaas aaas, boolean z) {
        super(switchPreference, alcs, aldg, axgk);
        this.e = uwm;
        this.f = uum;
        this.g = z;
        this.h = aaas;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            anxp anxp = this.b.g;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.f);
                aaas aaas = this.h;
                apxu apxu = this.b.g;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
                return false;
            }
        }
        boolean onPreferenceChange = super.onPreferenceChange(preference, obj);
        this.e.a(this.g, this.a.isChecked() ^ 1);
        return onPreferenceChange;
    }
}
