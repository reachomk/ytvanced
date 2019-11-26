package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vsg */
public final class vsg extends afns {
    private vse a;

    protected vsg() {
    }

    public final int a() {
        return 3;
    }

    public vsg(vse vse) {
        this.a = vse;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        vso vso = this.a.a;
        if (vso instanceof vtk) {
            afns.a(jSONObject, "videoAd", (afnt) vso);
        } else if (vso instanceof vrx) {
            afns.a(jSONObject, "forecastingAd", (afnt) vso);
        } else if (vso instanceof vsu) {
            afns.a(jSONObject, "surveyAd", (afnt) vso);
        } else if (vso instanceof vrj) {
            afns.a(jSONObject, "adVideoEnd", (afnt) vso);
        } else if (vso instanceof vrc) {
            afns.a(jSONObject, "adIntro", (afnt) vso);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 3) {
            vso vso;
            String str = "videoAd";
            if (vtk.c.b(jSONObject, str) != null) {
                vso = (vso) vtk.c.b(jSONObject, str);
            } else {
                str = "forecastingAd";
                if (vrx.b.b(jSONObject, str) != null) {
                    vso = (vso) vrx.b.b(jSONObject, str);
                } else {
                    str = "surveyAd";
                    if (vsu.b.b(jSONObject, str) != null) {
                        vso = (vso) vsu.b.b(jSONObject, str);
                    } else {
                        str = "adVideoEnd";
                        if (vrj.c.b(jSONObject, str) != null) {
                            vso = (vso) vrj.c.b(jSONObject, str);
                        } else {
                            str = "adIntro";
                            vso = vrc.b.b(jSONObject, str) != null ? (vso) vrc.b.b(jSONObject, str) : null;
                        }
                    }
                }
            }
            return new vse(vso);
        }
        throw new JSONException("Unsupported version");
    }
}
