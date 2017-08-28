/**
 * Created by zangyaoyi on 2017/4/17.
 */
public class TestSpace {
    public static void main(String[] args) {
        String a = " logger.info(\"[epChannel],receive Iec104ProcessFormatI 130 record_type:{},Identity:{},channel:{}\",\n" +
                "                new Object[]{record_type, epCommClient.getIdentity(), epCommClient.getChannel()});\n" +
                "\n" +
                "        ByteBuffer byteBuffer = ByteBuffer.wrap(msg);\n" +
                "\n" +
                "        try {\n" +
                "            ByteBufferUtil.readWithLength(byteBuffer, ApciHeader.NUM_CTRL\n" +
                "                    + AsduHeader.H_LEN + 1);\n" +
                "\n" +
                "            switch (record_type) {\n" +
                "                case Iec104Constant.M_CONSUME_MODEL_REQ: {\n" +
                "                    EpDecoder.decodeConsumeModelReq(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CONSUME_MODE_RET:// 计费模型结果上行数据\n" +
                "                {\n" +
                "                    // 1 终端机器编码 BCD码 8Byte 16位编码\n" +
                "                    String epCode = ByteBufferUtil.readBCDWithLength(byteBuffer, 8);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_BUSINESS_TIME_RET:\n" +
                "                    // 私有充电桩下发充电桩运营时间上行结果数据\n" +
                "                    break;\n" +
                "                case Iec104Constant.M_NOCARD_PW_AUTH: {\n" +
                "                    EpDecoder.decodeNoCardAuthByPw(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_BESPOKE_RET: {\n" +
                "                    EpDecoder.decodeEpBespRet(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CANCEL_BESPOKE_RET: {\n" +
                "                    EpDecoder.decodeEpCancelBespRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_NOCARD_YZM_AUTH: {\n" +
                "                    EpDecoder.decodeNoCardAuthByYZM(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_START_CHARGE_EVENT: {\n" +
                "                    EpDecoder.decodeStartElectricizeEventV3(epCommClient,\n" +
                "                            byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_STOP_ELECTRICIZE_EVENT: {\n" +
                "                    EpDecoder.decodeStopElectricizeEvent(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_START_ELECTRICIZE_RET: {\n" +
                "                    EpDecoder.decodeEpStartChargeResp(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_STOP_ELECTRICIZE_RET: {\n" +
                "                    EpDecoder.decodeEpStopChargeResp(epCommClient, byteBuffer);\n" +
                "                    break;\n" +
                "                }\n" +
                "                case Iec104Constant.M_CONSUME_RECORD: {\n" +
                "                    EpDecoder.decodeConsumeRecord(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_QUERY_CONSUME_RECORD_RET: {\n" +
                "                    EpDecoder.decodeQueryConsumeRecord(epCommClient, byteBuffer,\n" +
                "                            msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_BALANCE_WARNING: {\n" +
                "                    EpDecoder.decodeBalanceWarning(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_HEX_FILE_SUMARY_REQ: {\n" +
                "                    EpDecoder.decodeEpHexFileSumaryReq(epCommClient, byteBuffer,\n" +
                "                            msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_HEX_FILE_DOWN_REQ: {\n" +
                "                    EpDecoder.decodeEpHexFileDownReq(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_STAT_RET: {\n" +
                "                    EpDecoder.decodeStatReq(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_COMM_SIGNAL_RET: {\n" +
                "                    EpDecoder.decodeCommSignal(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_DC_SELF_CHECK_FINISHED:\n" +
                "                    break;\n" +
                "                case Iec104Constant.M_EP_IDENTYCODE: {\n" +
                "                    EpDecoder.decodeEpIdentyCodeQuery(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_LOCK_GUN_FAIL_WARNING: {\n" +
                "                    EpDecoder.decodeLockGunFailWaring(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_REPORT_DEVICE: {\n" +
                "                    EpDecoder.decodeEpDevices(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.C_CARD_FRONZE_AMT: {\n" +
                "                    EpDecoder.decodeCardFronzeAmt(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CARD_AUTH: {\n" +
                "                    EpDecoder.decodeUserCardAuth(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_DEVICE_VERSION_RET: {\n" +
                "                    EpDecoder.decodeVersionAck(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_HEX_FILE_UPDATE_RET: {\n" +
                "                    EpDecoder.decodeUpdateAck(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CONCENTROTER_SET_EP_RET: {\n" +
                "                    EpDecoder.decodeConcentroterSetEPRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CONCENTROTER_GET_EP_RET: {\n" +
                "                    EpDecoder.decodeConcentroterGetEPRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_GET_CONSUME_MODEL_RET: {\n" +
                "                    EpDecoder.decodeGetConsumeModelRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_GET_FLASH_RAM_RET: {\n" +
                "                    EpDecoder.decodeGetFlashRamRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_GET_TEMPCHARGE_NUM_RET: {\n" +
                "                    EpDecoder.decodeGetTempChargeRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_SET_TEMPCHARGE_NUM_RET: {\n" +
                "                    EpDecoder.decodeSetTempChargeRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                default:\n" +
                "                    break;\n" +
                "            }\n" +
                "        } catch (Exception e) {\n" +
                "            logger.error(\"[epChannel], Iec104ProcessFormatI 130 exception, Channel:{},e.getMessage():{}\", epCommClient.getChannel(), e.getMessage());\n" +
                "        }\n" +
                "    }";
        String b = "logger.info(\"[epChannel],receive Iec104ProcessFormatI 130 record_type:{},Identity:{},channel:{}\",\n" +
                "                new Object[]{record_type, epCommClient.getIdentity(), epCommClient.getChannel()});\n" +
                "\n" +
                "        ByteBuffer byteBuffer = ByteBuffer.wrap(msg);\n" +
                "\n" +
                "        try {\n" +
                "            ByteBufferUtil.readWithLength(byteBuffer, ApciHeader.NUM_CTRL\n" +
                "                    + AsduHeader.H_LEN + 1);\n" +
                "\n" +
                "            switch (record_type) {\n" +
                "                case Iec104Constant.M_CONSUME_MODEL_REQ: {\n" +
                "                    EpDecoder.decodeConsumeModelReq(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CONSUME_MODE_RET:// 计费模型结果上行数据\n" +
                "                {\n" +
                "                    // 1 终端机器编码 BCD码 8Byte 16位编码\n" +
                "                    String epCode = ByteBufferUtil.readBCDWithLength(byteBuffer, 8);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_BUSINESS_TIME_RET:\n" +
                "                    // 私有充电桩下发充电桩运营时间上行结果数据\n" +
                "                    break;\n" +
                "                case Iec104Constant.M_NOCARD_PW_AUTH: {\n" +
                "                    EpDecoder.decodeNoCardAuthByPw(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_BESPOKE_RET: {\n" +
                "                    EpDecoder.decodeEpBespRet(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CANCEL_BESPOKE_RET: {\n" +
                "                    EpDecoder.decodeEpCancelBespRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_NOCARD_YZM_AUTH: {\n" +
                "                    EpDecoder.decodeNoCardAuthByYZM(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_START_CHARGE_EVENT: {\n" +
                "                    EpDecoder.decodeStartElectricizeEventV3(epCommClient,\n" +
                "                            byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_STOP_ELECTRICIZE_EVENT: {\n" +
                "                    EpDecoder.decodeStopElectricizeEvent(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_START_ELECTRICIZE_RET: {\n" +
                "                    EpDecoder.decodeEpStartChargeResp(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_STOP_ELECTRICIZE_RET: {\n" +
                "                    EpDecoder.decodeEpStopChargeResp(epCommClient, byteBuffer);\n" +
                "                    break;\n" +
                "                }\n" +
                "                case Iec104Constant.M_CONSUME_RECORD: {\n" +
                "                    EpDecoder.decodeConsumeRecord(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_QUERY_CONSUME_RECORD_RET: {\n" +
                "                    EpDecoder.decodeQueryConsumeRecord(epCommClient, byteBuffer,\n" +
                "                            msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_BALANCE_WARNING: {\n" +
                "                    EpDecoder.decodeBalanceWarning(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_HEX_FILE_SUMARY_REQ: {\n" +
                "                    EpDecoder.decodeEpHexFileSumaryReq(epCommClient, byteBuffer,\n" +
                "                            msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_HEX_FILE_DOWN_REQ: {\n" +
                "                    EpDecoder.decodeEpHexFileDownReq(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_STAT_RET: {\n" +
                "                    EpDecoder.decodeStatReq(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_COMM_SIGNAL_RET: {\n" +
                "                    EpDecoder.decodeCommSignal(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_DC_SELF_CHECK_FINISHED:\n" +
                "                    break;\n" +
                "                case Iec104Constant.M_EP_IDENTYCODE: {\n" +
                "                    EpDecoder.decodeEpIdentyCodeQuery(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_LOCK_GUN_FAIL_WARNING: {\n" +
                "                    EpDecoder.decodeLockGunFailWaring(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_EP_REPORT_DEVICE: {\n" +
                "                    EpDecoder.decodeEpDevices(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.C_CARD_FRONZE_AMT: {\n" +
                "                    EpDecoder.decodeCardFronzeAmt(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CARD_AUTH: {\n" +
                "                    EpDecoder.decodeUserCardAuth(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_DEVICE_VERSION_RET: {\n" +
                "                    EpDecoder.decodeVersionAck(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_HEX_FILE_UPDATE_RET: {\n" +
                "                    EpDecoder.decodeUpdateAck(epCommClient, byteBuffer, msg);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CONCENTROTER_SET_EP_RET: {\n" +
                "                    EpDecoder.decodeConcentroterSetEPRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_CONCENTROTER_GET_EP_RET: {\n" +
                "                    EpDecoder.decodeConcentroterGetEPRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_GET_CONSUME_MODEL_RET: {\n" +
                "                    EpDecoder.decodeGetConsumeModelRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_GET_FLASH_RAM_RET: {\n" +
                "                    EpDecoder.decodeGetFlashRamRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_GET_TEMPCHARGE_NUM_RET: {\n" +
                "                    EpDecoder.decodeGetTempChargeRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                case Iec104Constant.M_SET_TEMPCHARGE_NUM_RET: {\n" +
                "                    EpDecoder.decodeSetTempChargeRet(epCommClient, byteBuffer);\n" +
                "                }\n" +
                "                break;\n" +
                "                default:\n" +
                "                    break;\n" +
                "            }\n" +
                "        } catch (Exception e) {\n" +
                "\n" +
                "            logger.error(\"[epChannel], Iec104ProcessFormatI 130 exception, Channel:{},e.getStackTrace():{}\", epCommClient.getChannel(), e.getStackTrace());\n" +
                "        }\n" +
                "    }";
        a = a.replaceAll(" ","");
        b = b.replaceAll(" ","");
        a = a.trim();
        b = b.trim();
        a=a.replaceAll("\\n", "");
        b=b.replaceAll("\\n", "");
        System.out.println(a.equals(b));

    }
}
