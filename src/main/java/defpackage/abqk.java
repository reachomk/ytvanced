package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import java.util.Map;

/* renamed from: abqk */
public final class abqk implements aaap {
    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) b;
            if ((liveChatEndpointOuterClass$LiveChatEndpoint.a & 2) != 0) {
                abox abox = (abox) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", abox.class);
                if (abox != null) {
                    aufw aufw = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                    if (aufw == null) {
                        aufw = aufw.g;
                    }
                    aufw aufw2;
                    if ((aufw.a & 1) == 0) {
                        aufw = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                        if (aufw == null) {
                            aufw = aufw.g;
                        }
                        if ((aufw.a & 2) == 0) {
                            aufw = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                            if (aufw == null) {
                                aufw = aufw.g;
                            }
                            if ((aufw.a & 4) == 0) {
                                aufw = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                                if (aufw == null) {
                                    aufw = aufw.g;
                                }
                                if ((aufw.a & 8) == 0) {
                                    aufw = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                                    if (aufw == null) {
                                        aufw = aufw.g;
                                    }
                                    if ((aufw.a & 16) != 0) {
                                        aufw2 = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                                        if (aufw2 == null) {
                                            aufw2 = aufw.g;
                                        }
                                        b = aufw2.f;
                                        if (b == null) {
                                            b = awgm.d;
                                        }
                                        abox.a(ajtj.a(b));
                                    }
                                    return;
                                }
                                aufw2 = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                                if (aufw2 == null) {
                                    aufw2 = aufw.g;
                                }
                                b = aufw2.e;
                                if (b == null) {
                                    b = auga.e;
                                }
                                abox.a(ajtj.a(b));
                                return;
                            }
                            aufw2 = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                            if (aufw2 == null) {
                                aufw2 = aufw.g;
                            }
                            b = aufw2.d;
                            if (b == null) {
                                b = atuj.f;
                            }
                            abox.a(ajtj.a(b));
                            return;
                        }
                        aufw2 = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                        if (aufw2 == null) {
                            aufw2 = aufw.g;
                        }
                        b = aufw2.c;
                        if (b == null) {
                            b = ayhc.e;
                        }
                        abox.a(ajtj.a(b));
                        return;
                    }
                    aufw2 = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                    if (aufw2 == null) {
                        aufw2 = aufw.g;
                    }
                    b = aufw2.b;
                    if (b == null) {
                        b = awzv.d;
                    }
                    abox.a(ajtj.a(b));
                }
            }
        }
    }
}
