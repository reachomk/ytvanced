package defpackage;

import android.text.TextUtils;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akev */
public abstract class akev {
    public static final amul a;
    private static final amul b;

    public abstract akhr a();

    public abstract amur b();

    public abstract int c();

    public abstract float d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract float r();

    public abstract boolean s();

    public abstract boolean t();

    public abstract int u();

    public final akhr a(akhs akhs) {
        return (akhr) b().get(akhs);
    }

    public static akev a(zyw zyw, boolean z) {
        akes akes = new akes();
        amxn amxn = (amxn) b.listIterator();
        while (amxn.hasNext()) {
            ((akht) amxn.next()).a(akes);
        }
        akes.a(akhr.q().a());
        Map enumMap = new EnumMap(akhs.class);
        for (Object put : akhs.values()) {
            enumMap.put(put, akhr.q().a());
        }
        akes.a(enumMap);
        apxn a = zyw.a();
        if (a == null) {
            return akes.a();
        }
        axam axam = a.k;
        if (axam == null) {
            axam = axam.d;
        }
        String str = axam.c;
        if (TextUtils.isEmpty(str)) {
            return akes.a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            amxn amxn2 = (amxn) b.listIterator();
            while (amxn2.hasNext()) {
                akht akht = (akht) amxn2.next();
                try {
                    akht.a(jSONObject, akes, "");
                } catch (akhy | JSONException e) {
                    String str2 = "Error parsing ElementsLaunchConfig.";
                    if (z) {
                        String valueOf = String.valueOf(akht.a);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        throw new IllegalStateException(valueOf, e);
                    }
                    afpf afpf = afpf.elements;
                    String valueOf2 = String.valueOf(akht.a);
                    if (valueOf2.length() == 0) {
                        valueOf2 = new String(str2);
                    } else {
                        valueOf2 = str2.concat(valueOf2);
                    }
                    afpc.a(2, afpf, valueOf2, e);
                }
            }
            Map enumMap2 = new EnumMap(akhs.class);
            akhr a2 = akhr.a(null, null, jSONObject, z);
            akes.a(a2);
            for (akhs akhs : akhs.values()) {
                enumMap2.put(akhs, akhr.a(akhs, a2, jSONObject, z));
            }
            akes.a(enumMap2);
            return akes.a();
        } catch (JSONException e2) {
            String str3 = "Error parsing ElementsLaunchConfig";
            if (z) {
                throw new IllegalStateException(str3, e2);
            }
            afpc.a(2, afpf.elements, str3, e2);
            return akes.a();
        }
    }

    static {
        akht a = akht.a("litho_layout_thread_pool_multiplier", Float.valueOf(1.0f), akey.a, akex.a);
        Boolean valueOf = Boolean.valueOf(false);
        akht a2 = akht.a("use_unified_template_resolver", valueOf, akfk.a, akft.a);
        akht a3 = akht.a("prewarm_unified_template_resolver", valueOf, akgg.a, akgp.a);
        Boolean valueOf2 = Boolean.valueOf(true);
        akht a4 = akht.a("use_arena_eko_processor", valueOf2, akhc.a, akhl.a);
        akht a5 = akht.a("replace_rb_grid_row", valueOf, akhn.a, akhq.a);
        akht a6 = akht.a("use_legacy_visible", valueOf, akfa.a, akez.a);
        akht a7 = akht.a("cleanup_rb_component_subscriptions", valueOf, akfc.a, akfb.a);
        akht a8 = akht.a("cleanup_rb_component_subscriptions_range", Integer.valueOf(0), akfe.a, akfd.a);
        akht a9 = akht.a("cleanup_rb_component_subscriptions_duplicates", valueOf, akfg.a, akff.a);
        akht a10 = akht.a("support_animation_drawable", valueOf, akfi.a, akfh.a);
        akht a11 = akht.a("support_elements_command_extension", valueOf2, akfj.a, akfm.a);
        akht a12 = akht.a("enable_elements_performance_metric", valueOf, akfl.a, akfo.a);
        akht[] akhtArr = new akht[7];
        Float valueOf3 = Float.valueOf(0.0f);
        akhtArr[0] = new akht("elements_performance_metric_sample_rate", valueOf3, akfn.a, akfq.a, null, akfp.a);
        Float f = valueOf3;
        akht akht = a12;
        akht akht2 = a11;
        akhtArr[1] = akht.a("delay_resolve_in_element_observer", valueOf, akfs.a, akfr.a);
        akhtArr[2] = akht.a("enable_pb_to_fb_metric", valueOf, akfu.a, akfw.a);
        akhtArr[3] = akht.a("use_utp_eko_arena", valueOf2, akfv.a, akfy.a);
        Integer valueOf4 = Integer.valueOf(2);
        Boolean bool = valueOf2;
        String str = "android_image_client";
        Integer num = valueOf4;
        akhtArr[4] = new akht(str, num, akfx.a, akga.a, amur.a("glide_framework", Integer.valueOf(1), "yt_downloader", valueOf4), null);
        akhtArr[5] = akht.a("litho_set_layout_thread_pool_on_rb", valueOf, akfz.a, akgc.a);
        akhtArr[6] = akht.a("eko_processor_max_lru_cache_size", Integer.valueOf(30), akgb.a, akge.a);
        b = amul.a(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, akht2, akht, akhtArr);
        valueOf4 = Integer.valueOf(4);
        akht a13 = akht.a("litho_init_range", valueOf4, akgd.a, akgf.a);
        Float valueOf5 = Float.valueOf(0.5f);
        akht a14 = akht.a("litho_range_ratio", valueOf5, akgi.a, akgh.a);
        Boolean bool2 = bool;
        akht a15 = akht.a("use_adapter_proxy", bool2, akgk.a, akgj.a);
        akht a16 = akht.a("recycler_view_item_prefetch", bool2, akgm.a, akgl.a);
        akht a17 = akht.a("recycler_view_fixed_size", valueOf, akgo.a, akgn.a);
        akht a18 = akht.a("recycler_view_disable_view_cache", bool2, akgq.a, akgs.a);
        akht a19 = akht.a("use_incremental_mount_for_rb", bool2, akgr.a, akgu.a);
        akht a20 = akht.a("use_size_spec_youtube_element", valueOf, akgt.a, akgw.a);
        akht a21 = akht.a("use_async_presenter_preparation", valueOf, akgv.a, akgy.a);
        akht a22 = akht.a("async_prepare_init_range", valueOf4, akgx.a, akha.a);
        akht a23 = akht.a("async_prepare_range_ratio", valueOf5, akgz.a, akhb.a);
        akht a24 = akht.a("use_incremental_mount_for_async_prepare", bool2, akhe.a, akhd.a);
        akhtArr = new akht[4];
        akhtArr[0] = akht.a("use_flatbuffer_runtime", valueOf, akhg.a, akhf.a);
        akhtArr[1] = akht.a("image_prefetch_range_ratio", f, akhi.a, akhh.a);
        akhtArr[2] = akht.a("rb_schedule_async_init_range_one", valueOf, akhk.a, akhj.a);
        akhtArr[3] = akht.a("rb_schedule_async_init_range_all", valueOf, akhm.a, akho.a);
        a = amul.a(a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, akhtArr);
    }
}
