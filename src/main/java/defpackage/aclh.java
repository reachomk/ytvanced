package defpackage;

import com.google.android.youtube.R;
import java.util.EnumMap;

/* renamed from: aclh */
public final class aclh implements akvp {
    private volatile EnumMap a = new EnumMap(arwh.class);

    public aclh() {
        this.a.put(arwh.LINK, Integer.valueOf(R.drawable.quantum_ic_link_white_24));
        this.a.put(arwh.PUBLIC, Integer.valueOf(R.drawable.quantum_ic_public_white_24));
        EnumMap enumMap = this.a;
        arwh arwh = arwh.PHOTO_CAMERA_LIGHT;
        Integer valueOf = Integer.valueOf(R.drawable.quantum_ic_photo_camera_white_24);
        enumMap.put(arwh, valueOf);
        this.a.put(arwh.PHOTO_CAMERA, valueOf);
        enumMap = this.a;
        arwh = arwh.CHAT_BUBBLE;
        valueOf = Integer.valueOf(R.drawable.ic_chat_on_white_24dp);
        enumMap.put(arwh, valueOf);
        enumMap = this.a;
        arwh = arwh.CHAT_BUBBLE_OFF;
        Integer valueOf2 = Integer.valueOf(R.drawable.ic_chat_off_white_24dp);
        enumMap.put(arwh, valueOf2);
        this.a.put(arwh.VOICE_CHAT, Integer.valueOf(R.drawable.quantum_ic_voice_chat_white_24));
        enumMap = this.a;
        arwh = arwh.SETTINGS_LIGHT;
        Integer valueOf3 = Integer.valueOf(R.drawable.quantum_ic_settings_white_24);
        enumMap.put(arwh, valueOf3);
        this.a.put(arwh.SETTINGS, valueOf3);
        this.a.put(arwh.KIDS_BLOCK_LIGHT, Integer.valueOf(R.drawable.quantum_ic_block_white_24));
        this.a.put(arwh.CREATOR_METADATA_MONETIZATION, Integer.valueOf(R.drawable.quantum_ic_attach_money_white_24));
        this.a.put(arwh.CREATOR_METADATA_MONETIZATION_OFF, Integer.valueOf(R.drawable.quantum_ic_money_off_white_24));
        this.a.put(arwh.VIDEO_CAMERA_SWITCH_LIGHT, Integer.valueOf(R.drawable.ic_switch_camera_white_24dp));
        this.a.put(arwh.FILTER_EFFECT_LIGHT, Integer.valueOf(R.drawable.ic_filters));
        this.a.put(arwh.FLASH_ON, Integer.valueOf(R.drawable.quantum_ic_flash_on_white_24));
        this.a.put(arwh.FLASH_OFF, Integer.valueOf(R.drawable.quantum_ic_flash_off_white_24));
        this.a.put(arwh.MICROPHONE_ON, Integer.valueOf(R.drawable.quantum_ic_mic_white_24));
        this.a.put(arwh.MICROPHONE_OFF, Integer.valueOf(R.drawable.quantum_ic_mic_off_white_24));
        this.a.put(arwh.MORE_HORIZ_LIGHT, Integer.valueOf(R.drawable.quantum_ic_more_vert_white_24));
        this.a.put(arwh.CHAT_BUBBLE_LIGHT, valueOf);
        enumMap = this.a;
        arwh = arwh.SHARE_ARROW;
        valueOf = Integer.valueOf(R.drawable.quantum_ic_googleplus_reshare_white_24);
        enumMap.put(arwh, valueOf);
        this.a.put(arwh.SHARE_ARROW_LIGHT, valueOf);
        enumMap = this.a;
        arwh = arwh.SPONSORS_ONLY_LIVE_CHAT_MODE_ON;
        valueOf = Integer.valueOf(R.drawable.ic_memberships_white_24);
        enumMap.put(arwh, valueOf);
        this.a.put(arwh.SPONSORS_ONLY_LIVE_CHAT_MODE_OFF, valueOf);
        this.a.put(arwh.CHAT_OFF, valueOf2);
        this.a.put(arwh.CHAT, Integer.valueOf(R.drawable.quantum_ic_chat_white_24));
        this.a.put(arwh.CHAT_SPONSORED, Integer.valueOf(R.drawable.ic_sponsorsmode_enabled_24));
        this.a.put(arwh.CLOSE_LIGHT, Integer.valueOf(R.drawable.quantum_ic_close_white_24));
        this.a.put(arwh.CLOSE, Integer.valueOf(R.drawable.quantum_ic_close_black_24));
        this.a.put(arwh.ADD, Integer.valueOf(R.drawable.quantum_ic_add_white_24));
        this.a.put(arwh.PLACE, Integer.valueOf(R.drawable.quantum_ic_place_white_24));
        this.a.put(arwh.EVENT_LIGHT, Integer.valueOf(R.drawable.quantum_ic_event_white_24));
        this.a.put(arwh.CREATOR_METADATA_BASIC, Integer.valueOf(R.drawable.quantum_ic_create_white_24));
        this.a.put(arwh.UPLOAD, Integer.valueOf(R.drawable.quantum_ic_file_upload_white_24));
        this.a.put(arwh.BACK, Integer.valueOf(R.drawable.quantum_ic_arrow_back_black_24));
        this.a.put(arwh.BACK_LIGHT, Integer.valueOf(R.drawable.quantum_ic_arrow_back_white_24));
        this.a.put(arwh.DELETE_LIGHT, Integer.valueOf(R.drawable.quantum_ic_delete_white_24));
        this.a.put(arwh.VOLUME_UP, Integer.valueOf(R.drawable.quantum_ic_volume_up_white_24));
        this.a.put(arwh.SPEAKER_NOTES, Integer.valueOf(R.drawable.quantum_ic_speaker_notes_white_24));
        this.a.put(arwh.MOBILE_SCREEN_SHARE, Integer.valueOf(R.drawable.quantum_ic_mobile_screen_share_white_24));
    }

    public final int a(arwh arwh) {
        return this.a.containsKey(arwh) ? ((Integer) this.a.get(arwh)).intValue() : 0;
    }
}
