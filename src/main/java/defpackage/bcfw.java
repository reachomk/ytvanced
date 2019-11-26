package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcfw */
public final class bcfw {
    public static final bcgh a = bcfw.a("authorization_endpoint");
    public static final bcgh b = bcfw.a("token_endpoint");
    public static final bcgh c = bcfw.a("registration_endpoint");
    private static final bcgf e = new bcgf("issuer");
    private static final bcgh f = bcfw.a("jwks_uri");
    private static final bcge g = bcfw.b("response_types_supported");
    private static final bcge h = bcfw.b("subject_types_supported");
    private static final bcge i = bcfw.b("id_token_signing_alg_values_supported");
    private static final List j = Arrays.asList(new String[]{e.a, a.a, f.a, g.a, h.a, i.a});
    public final JSONObject d;

    public bcfw(JSONObject jSONObject) {
        this.d = (JSONObject) bcgg.a(jSONObject);
        for (String str : j) {
            if (!this.d.has(str) || this.d.get(str) == null) {
                throw new bcfz(str);
            }
        }
    }

    public final Object a(bcgd bcgd) {
        JSONObject jSONObject = this.d;
        try {
            if (jSONObject.has(bcgd.a)) {
                return Uri.parse(jSONObject.getString(bcgd.a));
            }
            return bcgd.b;
        } catch (JSONException e) {
            throw new IllegalStateException("unexpected JSONException", e);
        }
    }

    private static bcgh a(String str) {
        return new bcgh(str);
    }

    private static bcge b(String str) {
        return new bcge(str);
    }

    private static bcge a(String str, List list) {
        return new bcge(str, (byte) 0);
    }

    private static bcga a(String str, boolean z) {
        return new bcga(str, z);
    }

    static {
        bcfw.a("userinfo_endpoint");
        bcfw.b("scopes_supported");
        bcfw.b("response_modes_supported");
        String str = "grant_types_supported";
        bcfw.a(str, Arrays.asList(new String[]{"authorization_code", "implicit"}));
        bcfw.b("acr_values_supported");
        String str2 = "id_token_encryption_enc_values_supported";
        bcfw.b(str2);
        bcfw.b(str2);
        bcfw.b("userinfo_signing_alg_values_supported");
        bcfw.b("userinfo_encryption_alg_values_supported");
        bcfw.b("userinfo_encryption_enc_values_supported");
        bcfw.b("request_object_signing_alg_values_supported");
        bcfw.b("request_object_encryption_alg_values_supported");
        bcfw.b("request_object_encryption_enc_values_supported");
        bcfw.a("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));
        bcfw.b("token_endpoint_auth_signing_alg_values_supported");
        bcfw.b("display_values_supported");
        bcfw.a("claim_types_supported", Collections.singletonList("normal"));
        bcfw.b("claims_supported");
        bcfw.a("service_documentation");
        bcfw.b("claims_locales_supported");
        bcfw.b("ui_locales_supported");
        bcfw.a("claims_parameter_supported", false);
        bcfw.a("request_parameter_supported", false);
        bcfw.a("request_uri_parameter_supported", true);
        bcfw.a("require_request_uri_registration", false);
        bcfw.a("op_policy_uri");
        bcfw.a("op_tos_uri");
    }
}
