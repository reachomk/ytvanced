package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: akoz */
public final class akoz {
    public static final akot a(View view) {
        amqw.a((Object) view);
        Object tag = view.getTag(R.id.presenter_adapter_tag);
        if (tag instanceof akot) {
            return (akot) tag;
        }
        return null;
    }

    public static final int b(View view) {
        amqw.a((Object) view);
        Object tag = view.getTag(R.id.presenter_adapter_viewtype_tag);
        return tag instanceof Integer ? ((Integer) tag).intValue() : -1;
    }

    public static final akor c(View view) {
        amqw.a((Object) view);
        Object tag = view.getTag(R.id.presenter_adapter_context_tag);
        if (tag instanceof akor) {
            return (akor) tag;
        }
        return null;
    }

    public static final void a(View view, akot akot) {
        amqw.a((Object) view);
        view.setTag(R.id.presenter_adapter_tag, akot);
    }

    public static final void a(View view, akot akot, int i) {
        amqw.a((Object) view);
        view.setTag(R.id.presenter_adapter_tag, akot);
        view.setTag(R.id.presenter_adapter_viewtype_tag, Integer.valueOf(i));
    }

    public static final void a(View view, akor akor) {
        amqw.a((Object) view);
        view.setTag(R.id.presenter_adapter_context_tag, akor);
    }

    public static akot a(akpb akpb, Object obj, ViewGroup viewGroup) {
        amqw.a((Object) akpb);
        amqw.a(obj);
        int a = akpb.a(obj);
        if (a == -1) {
            return null;
        }
        return akpb.a(a, viewGroup);
    }

    public static void a(akot akot, akpb akpb) {
        amqw.a((Object) akot);
        akoz.a(akot, akot.K_(), akpb);
    }

    public static void a(akot akot, View view, akpb akpb) {
        amqw.a((Object) akpb);
        akor c = akoz.c(view);
        if (c != null) {
            c.a();
        }
        akot.a(akpb);
    }
}
