package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wlm */
public final class wlm {
    public aaas a;
    public final wlx b;
    public final xhv c;
    public final xpa d;
    public final Map e;
    public final Map f;
    public final Map g;

    public wlm(wlx wlx, xhv xhv, xpa xpa) {
        this.b = (wlx) amqw.a((Object) wlx);
        this.c = (xhv) amqw.a((Object) xhv);
        this.d = (xpa) amqw.a((Object) xpa);
        HashMap hashMap = new HashMap();
        hashMap.put(wls.EnabledLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_googblue_16));
        hashMap.put(wls.DisabledLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_grey600_16));
        hashMap.put(wls.EnabledDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_googblue_16));
        hashMap.put(wls.DisabledDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_grey600_16));
        this.e = hashMap;
        hashMap = new HashMap();
        hashMap.put(wls.EnabledLikeButton, Integer.valueOf(R.drawable.ic_thumb_up_yt_light_blue_16));
        hashMap.put(wls.DisabledLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_white_16));
        hashMap.put(wls.EnabledDislikeButton, Integer.valueOf(R.drawable.ic_thumb_down_yt_light_blue_16));
        hashMap.put(wls.DisabledDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_white_16));
        this.f = hashMap;
        hashMap = new HashMap();
        hashMap.put(wls.EnabledLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_googblue_24));
        hashMap.put(wls.DisabledLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_grey600_24));
        hashMap.put(wls.EnabledDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_googblue_24));
        hashMap.put(wls.DisabledDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_grey600_24));
        hashMap.put(wls.ElementsLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_white_24));
        hashMap.put(wls.ElementsDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_white_24));
        this.g = hashMap;
    }

    public final void a(ajsh ajsh, Map map, boolean z, ajsn ajsn, ImageView imageView, ImageView imageView2, TextView textView, acvx acvx, Map map2, wlp wlp) {
        ajsh ajsh2 = ajsh;
        Map map3 = map;
        boolean z2 = z;
        ajsn ajsn2 = ajsn;
        ImageView imageView3 = imageView;
        ImageView imageView4 = imageView2;
        TextView textView2 = textView;
        Map map4 = map2;
        wlp wlp2 = wlp;
        aphv a = this.b.a(ajsn2.g, ajsh2, z2);
        aphv b = this.b.b(ajsn2.g, ajsh2, z2);
        ImageView imageView5;
        ImageView imageView6;
        if (a == null || b == null) {
            TextView textView3 = textView2;
            imageView5 = imageView4;
            imageView6 = imageView3;
            imageView6.setVisibility(4);
            imageView6.setClickable(false);
            textView3.setVisibility(4);
            imageView5.setVisibility(4);
            imageView5.setClickable(false);
            return;
        }
        aphv aphv;
        wlp wlp3;
        ImageView imageView7;
        wlm.a(a, imageView3, textView2, map4);
        wlm.a(b, imageView4, map4);
        if ((a.a & 1024) != 0) {
            textView2.setText(ajqy.a(ajsn2.m));
            imageView3.setOnClickListener(new wlo(this, wlp2, a, map3));
            aphv = b;
            wlp3 = wlp2;
            imageView7 = imageView3;
        } else {
            wll wll = r0;
            aphv = b;
            wlp3 = wlp2;
            imageView7 = imageView3;
            wll wll2 = new wll(this, ajsn, ajsh, z, acvx, map, imageView, textView, map2, imageView2);
            imageView7.setOnClickListener(wll);
        }
        if ((aphv.a & 1024) != 0) {
            imageView6 = imageView7;
            wlq wlq = new wlq(this, wlp3, aphv, map3);
            imageView5 = imageView2;
            imageView5.setOnClickListener(wlq);
        } else {
            imageView5 = imageView2;
            imageView6 = imageView7;
            imageView5.setOnClickListener(new wln(this, ajsn, ajsh, z, acvx, map, imageView, textView, map2, imageView2));
        }
        imageView6.setVisibility(0);
        textView.setVisibility(0);
        imageView5.setVisibility(0);
    }

    private static Drawable a(Context context, int i, int i2) {
        Drawable a = ra.a(context, i);
        int a2 = xwe.a(context, i2, 0);
        if (a == null) {
            return null;
        }
        a = st.d(a);
        st.a(a, a2);
        return a;
    }

    public static void a(aphv aphv, ImageView imageView, TextView textView, Map map) {
        anxp anxp;
        int intValue = ((Integer) map.get(wls.EnabledLikeButton)).intValue();
        int intValue2 = ((Integer) map.get(wls.DisabledLikeButton)).intValue();
        if (aphv.b) {
            anxp = aphv.h;
            if (anxp == null) {
                anxp = apxu.d;
            }
            imageView.setImageDrawable(wlm.a(imageView.getContext(), intValue, (int) R.attr.ytStaticBlue));
            if ((aphv.a & 8192) != 0) {
                imageView.setContentDescription(aphv.l);
            }
        } else {
            anxp anxp2 = aphv.m;
            if (anxp2 == null) {
                anxp2 = apxu.d;
            }
            imageView.setImageDrawable(wlm.a(imageView.getContext(), intValue2, (int) R.attr.ytIcon1));
            if ((aphv.a & 128) != 0) {
                imageView.setContentDescription(aphv.f);
            }
            anxp = anxp2;
        }
        if (anxp != null) {
            anxr access$000 = anxl.checkIsLite(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) obj;
                if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() > 0) {
                    apxu apxu = (apxu) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0);
                    anxr access$0002 = anxl.checkIsLite(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction);
                    apxu.a(access$0002);
                    if (apxu.h.a(access$0002.d)) {
                        apxu apxu2 = (apxu) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0);
                        anxr access$0003 = anxl.checkIsLite(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction);
                        apxu2.a(access$0003);
                        obj = apxu2.h.b(access$0003.d);
                        if (obj == null) {
                            obj = access$0003.b;
                        } else {
                            obj = access$0003.a(obj);
                        }
                        arml arml = ((UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction) obj).b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                        textView.setText(ajqy.a(arml));
                    }
                }
            }
        }
    }

    public static void a(aphv aphv, ImageView imageView, Map map) {
        int intValue = ((Integer) map.get(wls.EnabledDislikeButton)).intValue();
        int intValue2 = ((Integer) map.get(wls.DisabledDislikeButton)).intValue();
        if (aphv.b) {
            imageView.setImageDrawable(wlm.a(imageView.getContext(), intValue, (int) R.attr.ytStaticBlue));
            if ((aphv.a & 8192) != 0) {
                imageView.setContentDescription(aphv.l);
                return;
            }
            return;
        }
        imageView.setImageDrawable(wlm.a(imageView.getContext(), intValue2, (int) R.attr.ytIcon1));
        if ((aphv.a & 128) != 0) {
            imageView.setContentDescription(aphv.f);
        }
    }
}
