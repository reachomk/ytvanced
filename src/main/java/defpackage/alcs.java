package defpackage;

import android.content.Context;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import java.util.List;

/* renamed from: alcs */
public class alcs {
    public final aldg b;
    public final Context c;
    public final aaas d;
    public final acvx e;
    public final alct f;

    public alcs(Context context, aaas aaas, acvx acvx, alct alct, aldg aldg) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (acvx) amqw.a((Object) acvx);
        this.f = (alct) amqw.a((Object) alct);
        this.b = (aldg) amqw.a((Object) aldg);
    }

    public final void a(PreferenceFragment preferenceFragment, akaf[] akafArr) {
        int i;
        PreferenceCategory preferenceCategory;
        akai akai;
        PreferenceScreen createPreferenceScreen = preferenceFragment.getPreferenceManager().createPreferenceScreen(this.c);
        for (akaf akaf : akafArr) {
            if (akaf.d != null) {
                int i2;
                int i3;
                preferenceCategory = new PreferenceCategory(this.c);
                akai akai2 = akaf.d;
                if (akai2.c != null) {
                    i2 = akai2.d;
                    i3 = i2 - 1;
                    if (i2 != 0) {
                        preferenceCategory.setKey(Integer.toString(i3));
                    } else {
                        throw null;
                    }
                }
                createPreferenceScreen.addPreference(preferenceCategory);
                akai = akaf.d;
                arml arml = akai.a;
                if (arml != null) {
                    preferenceCategory.setTitle(ajqy.a(arml));
                }
                for (akaf a : akai.b) {
                    Preference a2 = a(a, preferenceCategory.getKey());
                    if (a2 != null) {
                        preferenceCategory.addPreference(a2);
                    }
                }
            } else {
                Preference a3 = a(akaf, "");
                if (a3 != null) {
                    createPreferenceScreen.addPreference(a3);
                }
            }
        }
        preferenceFragment.setPreferenceScreen(createPreferenceScreen);
        int i4 = 0;
        while (i4 < akafArr.length && i4 < createPreferenceScreen.getPreferenceCount()) {
            Preference preference = createPreferenceScreen.getPreference(i4);
            akaf akaf2 = akafArr[i4];
            akai = akaf2.d;
            if (akai != null) {
                preferenceCategory = (PreferenceCategory) preference;
                for (i = 0; i < preferenceCategory.getPreferenceCount(); i++) {
                    a(createPreferenceScreen, preferenceCategory.getPreference(i), akai.b[i]);
                }
            } else {
                a(createPreferenceScreen, preference, akaf2);
            }
            i4++;
        }
    }

    public final void a(ListPreference listPreference, axha axha, String str) {
        arml arml;
        if ((axha.a & 2) != 0) {
            arml = axha.c;
            if (arml == null) {
                arml = arml.f;
            }
            listPreference.setTitle(ajqy.a(arml));
            arml = axha.c;
            if (arml == null) {
                arml = arml.f;
            }
            listPreference.setDialogTitle(ajqy.a(arml));
        }
        if ((axha.a & 4) != 0) {
            arml = axha.d;
            if (arml == null) {
                arml = arml.f;
            }
            listPreference.setSummary(ajqy.a(arml));
        }
        List a = alcs.a(axha);
        CharSequence[] charSequenceArr = new CharSequence[a.size()];
        CharSequence[] charSequenceArr2 = new CharSequence[a.size()];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < a.size(); i3++) {
            axgu axgu = (axgu) a.get(i3);
            charSequenceArr[i3] = axgu.b;
            charSequenceArr2[i3] = axgu.d;
            if (this.b.a(axgu)) {
                i = i3;
            } else if (str != null && axgu.d.equals(str)) {
                i2 = i3;
            }
        }
        listPreference.setEntries(charSequenceArr);
        listPreference.setEntryValues(charSequenceArr2);
        if (!(i == -1 && i2 == -1)) {
            if (i == -1) {
                i = i2;
            }
            listPreference.setValueIndex(i);
            listPreference.setSummary(listPreference.getEntry());
        }
        listPreference.setOnPreferenceChangeListener(new alcv(this, axha, listPreference));
    }

    public Preference a(akaf akaf, String str) {
        Object obj = akaf.b;
        arml arml = null;
        if (obj == null) {
            axha axha = akaf.a;
            if (axha == null) {
                obj = akaf.e;
                if (obj == null) {
                    axgi axgi = akaf.c;
                    if (axgi == null) {
                        return null;
                    }
                    Preference preference = new Preference(this.c);
                    if ((axgi.a & 2) != 0) {
                        arml = axgi.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    preference.setTitle(ajqy.a(arml));
                    if ((axgi.a & 4) != 0) {
                        arml = axgi.c;
                        if (arml == null) {
                            arml = arml.f;
                        }
                        preference.setSummary(ajqy.a(arml));
                    }
                    preference.setOnPreferenceClickListener(new alcx(this, axgi));
                    return preference;
                }
                Preference preference2 = new Preference(this.c);
                if ((obj.a & 2) != 0) {
                    arml = obj.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                preference2.setTitle(ajqy.a(arml));
                int i = obj.a;
                if ((i & 4) != 0) {
                    arml = obj.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    preference2.setSummary(ajqy.a(arml));
                } else if ((i & 16) != 0) {
                    arml = obj.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    preference2.setSummary(ajqy.a(arml));
                }
                if (alcs.a(obj) == 24) {
                    preference2.setSummary(xul.b(this.c));
                }
                preference2.setOnPreferenceClickListener(new alcu(this, obj));
                return preference2;
            }
            ListPreference listPreference = new ListPreference(this.c);
            a(listPreference, axha, null);
            return listPreference;
        }
        CharSequence a;
        SwitchPreference switchPreference = new SwitchPreference(this.c);
        boolean a2 = this.b.a((axgk) obj);
        if ((obj.a & 8) != 0) {
            arml arml2 = obj.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            switchPreference.setTitle(ajqy.a(arml2));
        }
        switchPreference.setDefaultValue(Boolean.valueOf(a2));
        switchPreference.setOnPreferenceChangeListener(new aldf(switchPreference, this, this.b, obj));
        switchPreference.setEnabled(obj.f ^ 1);
        arml arml3;
        if (obj.f && (obj.a & 1024) != 0) {
            arml3 = obj.j;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            a = ajqy.a(arml3);
        } else if (a2 || (obj.a & 512) == 0) {
            if ((obj.a & 16) != 0) {
                arml3 = obj.d;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            a = ajqy.a(arml3);
        } else {
            arml3 = obj.i;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            a = ajqy.a(arml3);
        }
        switchPreference.setSummary(a);
        alct alct;
        int a3;
        int i2;
        if (alcs.a(obj) == 21) {
            alct = this.f;
            a3 = alcs.a(obj);
            i2 = a3 - 1;
            if (a3 != 0) {
                switchPreference.setKey(alct.a(i2));
                switchPreference.setDefaultValue(Boolean.valueOf(true));
            } else {
                throw null;
            }
        } else if (alcs.a(obj) == 37) {
            alct = this.f;
            a3 = alcs.a(obj);
            i2 = a3 - 1;
            if (a3 != 0) {
                switchPreference.setKey(alct.a(i2));
                switchPreference.setDefaultValue(Boolean.valueOf(true));
            } else {
                throw null;
            }
        } else if (alcs.a(obj) == 74) {
            alct = this.f;
            a3 = alcs.a(obj);
            i2 = a3 - 1;
            if (a3 != 0) {
                switchPreference.setKey(alct.a(i2));
                switchPreference.setDefaultValue(Boolean.valueOf(false));
            } else {
                throw null;
            }
        }
        return switchPreference;
    }

    private final void a(PreferenceScreen preferenceScreen, Preference preference, akaf akaf) {
        for (axhe axhe : a(akaf)) {
            alct alct = this.f;
            int a = axhg.a(axhe.b);
            if (a == 0) {
                a = 1;
            }
            String a2 = alct.a(a - 1);
            if (a2 != null && (preferenceScreen.findPreference(a2) instanceof SwitchPreference)) {
                preference.setDependency(a2);
            }
        }
    }

    public List a(akaf akaf) {
        axha axha = akaf.a;
        if (axha != null) {
            return axha.f;
        }
        axgk axgk = akaf.b;
        if (axgk == null) {
            return amul.g();
        }
        return axgk.n;
    }

    public static List a(axha axha) {
        return amvj.a(amvj.a(amux.a(axha.e, alcw.a)), alcz.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    public static int a(java.lang.Object r5) {
        /*
        r0 = r5 instanceof defpackage.axgk;
        r1 = 0;
        r2 = 0;
        if (r0 == 0) goto L_0x0048;
    L_0x0006:
        r0 = r5;
        r0 = (defpackage.axgk) r0;
        r3 = r0.g;
        if (r3 != 0) goto L_0x000f;
    L_0x000d:
        r3 = defpackage.apxu.d;
    L_0x000f:
        r4 = com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        if (r3 != 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0048;
    L_0x0023:
        r5 = r0.g;
        if (r5 != 0) goto L_0x0029;
    L_0x0027:
        r5 = defpackage.apxu.d;
    L_0x0029:
        r0 = com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r5.a(r0);
        r5 = r5.h;
        r2 = r0.d;
        r5 = r5.b(r2);
        if (r5 != 0) goto L_0x003f;
    L_0x003c:
        r5 = r0.b;
        goto L_0x0043;
    L_0x003f:
        r5 = r0.a(r5);
    L_0x0043:
        r2 = r5;
        r2 = (com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint) r2;
        goto L_0x00d4;
    L_0x0048:
        r0 = r5 instanceof defpackage.axgy;
        if (r0 == 0) goto L_0x008d;
    L_0x004c:
        r0 = r5;
        r0 = (defpackage.axgy) r0;
        r3 = r0.i;
        if (r3 != 0) goto L_0x0055;
    L_0x0053:
        r3 = defpackage.apxu.d;
    L_0x0055:
        r4 = com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        if (r3 != 0) goto L_0x0069;
    L_0x0068:
        goto L_0x008d;
    L_0x0069:
        r5 = r0.i;
        if (r5 != 0) goto L_0x006f;
    L_0x006d:
        r5 = defpackage.apxu.d;
    L_0x006f:
        r0 = com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r5.a(r0);
        r5 = r5.h;
        r2 = r0.d;
        r5 = r5.b(r2);
        if (r5 != 0) goto L_0x0085;
    L_0x0082:
        r5 = r0.b;
        goto L_0x0089;
    L_0x0085:
        r5 = r0.a(r5);
    L_0x0089:
        r2 = r5;
        r2 = (com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint) r2;
        goto L_0x00d4;
    L_0x008d:
        r0 = r5 instanceof defpackage.axha;
        if (r0 == 0) goto L_0x00d4;
    L_0x0091:
        r5 = (defpackage.axha) r5;
        r0 = r5.e;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x00d4;
    L_0x009b:
        r5 = r5.e;
        r5 = r5.get(r1);
        r5 = (defpackage.axgw) r5;
        r0 = r5.a;
        r2 = 64166933; // 0x3d31c15 float:1.2407913E-36 double:3.1702677E-316;
        if (r0 != r2) goto L_0x00af;
    L_0x00aa:
        r5 = r5.b;
        r5 = (defpackage.axgu) r5;
        goto L_0x00b1;
    L_0x00af:
        r5 = defpackage.axgu.g;
    L_0x00b1:
        r5 = r5.f;
        if (r5 != 0) goto L_0x00b7;
    L_0x00b5:
        r5 = defpackage.apxu.d;
    L_0x00b7:
        r0 = com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r5.a(r0);
        r5 = r5.h;
        r2 = r0.d;
        r5 = r5.b(r2);
        if (r5 != 0) goto L_0x00cd;
    L_0x00ca:
        r5 = r0.b;
        goto L_0x00d1;
    L_0x00cd:
        r5 = r0.a(r5);
    L_0x00d1:
        r2 = r5;
        r2 = (com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint) r2;
    L_0x00d4:
        r5 = 1;
        if (r2 == 0) goto L_0x00f7;
    L_0x00d7:
        r0 = r2.a;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x00f7;
    L_0x00df:
        r0 = r2.a;
        r0 = r0.get(r1);
        r0 = (defpackage.axfy) r0;
        r0 = r0.d;
        if (r0 != 0) goto L_0x00ed;
    L_0x00eb:
        r0 = defpackage.axhe.c;
    L_0x00ed:
        r0 = r0.b;
        r0 = defpackage.axhg.a(r0);
        if (r0 != 0) goto L_0x00f6;
    L_0x00f5:
        return r5;
    L_0x00f6:
        return r0;
    L_0x00f7:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alcs.a(java.lang.Object):int");
    }
}
