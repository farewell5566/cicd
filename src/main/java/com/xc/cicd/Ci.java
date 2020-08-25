package com.xc.cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ci {

    @Autowired
    MyService myServ;

    @GetMapping("/add")
    public int add(int a,int b){

        Split();


        return myServ.add(a,b);
    }

    private void Split() {
        String []argus = {};
        String str = "、GS_HT_SGZBHTBA、GS_HT_JLHTBA、GS_HT_ZYLWSBCLHTBA、GS_HT_ZBHTLY\n" +
                "GS_SGXKZ\n" +
                "GS_ZBTZS\n" +
                "GS_SGXKZ\n" +
                "GS_GHXKZ、GS_HT_SGZBHTBA、GS_SGXKZ\n" +
                "GS_SGXKZ、GS_HT_SGZBHTBA\n" +
                "GS_JSDW、GS_SGDW、GS_JLDW、GS_SJDW、GS_KCDW\n" +
                "RY_RYXX、RY_YJXX、RY_ZHPJ、RY_XZCFXX、、RY_ZCZS_JZS、RY_ZCZS_ZJS、RY_ZCZS_JLS\n" +
                "RY_RYXX、RY_YJXX、RY_ZHPJ、RY_XZCFXX、、RY_ZCZS_JZS、RY_ZCZS_ZJS、RY_ZCZS_JLS\n" +
                "RY_RYXX、RY_YJXX、RY_ZHPJ、RY_XZCFXX、GS_GCXX、GS_JSDW、GS_SGDW、GS_JLDW、GS_SJDW、GS_KCDW\n" +
                "GS_GHXKZ、GS_HT_SGZBHTBA、GS_SGXKZ、GS_GCXX、GS_JSDW、GS_SGDW、GS_JLDW、GS_SJDW、GS_KCDW\n" +
                "GS_JSDW、GS_SGDW、GS_JLDW、GS_SJDW、GS_KCDW、QZ_QYXX、QJ_QYPFJG\n" +
                "RY_RYXX、RY_YJXX、RY_ZHPJ、RY_XZCFXX、、RY_ZCZS_JZS、RY_ZCZS_ZJS、RY_ZCZS_JLS\n";
        String[] strS = str.split("/");

    }

}
