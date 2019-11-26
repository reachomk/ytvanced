package defpackage;

import android.content.Context;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.SwitchPreference;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aldf */
public class aldf implements OnPreferenceChangeListener {
    public final SwitchPreference a;
    public final axgk b;
    public boolean c;
    public boolean d;
    private final alcs e;
    private final aldg f;
    private final afsw g = new alde(this);

    public aldf(SwitchPreference switchPreference, alcs alcs, aldg aldg, axgk axgk) {
        this.a = switchPreference;
        this.b = axgk;
        this.e = alcs;
        this.f = aldg;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        Preference preference2 = this.a;
        if (preference == preference2) {
            Boolean bool = (Boolean) obj;
            if (preference2.isChecked() == bool.booleanValue()) {
                return true;
            }
            alct alct = this.e.f;
            int a = alcs.a(this.b);
            int i = a - 1;
            arml arml = null;
            if (a != 0) {
                axgk axgk;
                axgo axgo;
                aqhy aqhy;
                alct.b(i);
                boolean booleanValue = bool.booleanValue();
                if (booleanValue) {
                    axgk = this.b;
                    if ((axgk.a & 2048) != 0) {
                        axgo = axgk.k;
                        if (axgo == null) {
                            axgo = axgo.c;
                        }
                        if (axgo.a == 64099105) {
                            aqhy = (aqhy) axgo.b;
                        } else {
                            aqhy = aqhy.q;
                        }
                        a(true, aqhy);
                        return false;
                    }
                }
                if (!booleanValue) {
                    axgk = this.b;
                    if ((axgk.a & 4096) != 0) {
                        axgo = axgk.l;
                        if (axgo == null) {
                            axgo = axgo.c;
                        }
                        if (axgo.a == 64099105) {
                            aqhy = (aqhy) axgo.b;
                        } else {
                            aqhy = aqhy.q;
                        }
                        a(false, aqhy);
                        return false;
                    }
                }
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                aaas aaas;
                apxu apxu;
                axgk axgk2;
                if (booleanValue) {
                    aaas = this.e.d;
                    apxu = this.b.g;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, hashMap);
                    axgk2 = this.b;
                    if ((axgk2.a & 16) != 0) {
                        arml = axgk2.d;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    preference.setSummary(ajqy.a(arml));
                } else {
                    aaas = this.e.d;
                    apxu = this.b.h;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, hashMap);
                    axgk2 = this.b;
                    if ((axgk2.a & 512) != 0) {
                        arml arml2 = axgk2.i;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                        preference.setSummary(ajqy.a(arml2));
                    }
                }
                this.f.a(this.b, booleanValue);
                return true;
            }
            throw null;
        }
        throw new IllegalArgumentException("SwitchPreferenceChangeListener must be attached to the same SwitchPreference as was used for construction.");
    }

    private final void a(boolean z, aqhy aqhy) {
        afsw valueOf;
        anxp anxp = aqhy.m;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
        anxp.a(access$000);
        this.c = anxp.h.a(access$000.d) ^ 1;
        alcs alcs = this.e;
        Context context = alcs.c;
        aaas aaas = alcs.d;
        acvx acvx = alcs.e;
        aldh aldh = new aldh(this, z);
        if (this.c) {
            valueOf = Boolean.valueOf(z);
        } else {
            valueOf = this.g;
        }
        akcq.a(context, aqhy, aaas, acvx, aldh, valueOf);
    }

    public final void a(boolean z) {
        arml arml;
        SwitchPreference switchPreference = this.a;
        axgk axgk = this.b;
        if ((axgk.a & 16) != 0) {
            arml = axgk.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        switchPreference.setSummary(ajqy.a(arml));
        this.f.a(this.b, z);
        this.a.setChecked(z);
    }
}
