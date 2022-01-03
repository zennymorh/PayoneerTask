package com.zennymorh.payoneertask.util;

public class MockSuccessResponse {
    public static final String SUCCESS_RESPONSE = "{\n" +
            "    \"networks\": {\n" +
            "        \"applicable\": [\n" +
            "            {\n" +
            "                \"code\": \"AMEX\",\n" +
            "                \"label\": \"American Express\",\n" +
            "                \"method\": \"CREDIT_CARD\",\n" +
            "                \"grouping\": \"CREDIT_CARD\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": false,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/amex.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/AMEX\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/AMEX.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/AMEX/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/AMEX/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"number\",\n" +
            "                        \"type\": \"numeric\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryMonth\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryYear\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"verificationCode\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"holderName\",\n" +
            "                        \"type\": \"string\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"DINERS\",\n" +
            "                \"label\": \"Diners Club\",\n" +
            "                \"method\": \"CREDIT_CARD\",\n" +
            "                \"grouping\": \"CREDIT_CARD\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": false,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/diners.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/DINERS\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/DINERS.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/DINERS/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/DINERS/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"number\",\n" +
            "                        \"type\": \"numeric\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryMonth\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryYear\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"verificationCode\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"holderName\",\n" +
            "                        \"type\": \"string\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"DISCOVER\",\n" +
            "                \"label\": \"Discover\",\n" +
            "                \"method\": \"CREDIT_CARD\",\n" +
            "                \"grouping\": \"CREDIT_CARD\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": false,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/discover.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/DISCOVER\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/DISCOVER.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/DISCOVER/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/DISCOVER/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"number\",\n" +
            "                        \"type\": \"numeric\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryMonth\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryYear\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"verificationCode\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"holderName\",\n" +
            "                        \"type\": \"string\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"IDEAL\",\n" +
            "                \"label\": \"iDEAL\",\n" +
            "                \"method\": \"ONLINE_BANK_TRANSFER\",\n" +
            "                \"grouping\": \"ONLINE_BANK_TRANSFER\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": true,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/ideal.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/IDEAL\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/IDEAL.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/IDEAL/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/IDEAL/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"bic\",\n" +
            "                        \"type\": \"string\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"MAESTRO\",\n" +
            "                \"label\": \"Maestro\",\n" +
            "                \"method\": \"DEBIT_CARD\",\n" +
            "                \"grouping\": \"DEBIT_CARD\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": false,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/maestro.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MAESTRO\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/MAESTRO.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MAESTRO/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/MAESTRO/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"holderName\",\n" +
            "                        \"type\": \"string\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"number\",\n" +
            "                        \"type\": \"numeric\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryYear\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryMonth\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"verificationCode\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"MASTERCARD\",\n" +
            "                \"label\": \"Mastercard\",\n" +
            "                \"method\": \"CREDIT_CARD\",\n" +
            "                \"grouping\": \"CREDIT_CARD\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": false,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/mastercard.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MASTERCARD\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/MASTERCARD.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MASTERCARD/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/MASTERCARD/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"number\",\n" +
            "                        \"type\": \"numeric\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryMonth\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryYear\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"verificationCode\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"holderName\",\n" +
            "                        \"type\": \"string\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"MISTERCASH\",\n" +
            "                \"label\": \"Bancontact/Mister Cash\",\n" +
            "                \"method\": \"DEBIT_CARD\",\n" +
            "                \"grouping\": \"DEBIT_CARD\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": false,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/mistercash.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MISTERCASH\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/MISTERCASH.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MISTERCASH/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/MISTERCASH/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"number\",\n" +
            "                        \"type\": \"numeric\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryYear\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryMonth\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"PAYFAST\",\n" +
            "                \"label\": \"PayFast\",\n" +
            "                \"method\": \"WALLET\",\n" +
            "                \"grouping\": \"WALLET\",\n" +
            "                \"registration\": \"NONE\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": true,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/payfast.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/PAYFAST\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/PAYFAST.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/PAYFAST/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/PAYFAST/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"PAYPAL\",\n" +
            "                \"label\": \"PayPal\",\n" +
            "                \"method\": \"WALLET\",\n" +
            "                \"grouping\": \"WALLET\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": true,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/paypal.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/PAYPAL\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/PAYPAL.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/PAYPAL/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/PAYPAL/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"contractData\": {\n" +
            "                    \"PAGE_ENVIRONMENT\": \"sandbox\",\n" +
            "                    \"JAVASCRIPT_INTEGRATION\": \"false\",\n" +
            "                    \"PAGE_BUTTON_LOCALE\": \"en_US\"\n" +
            "                },\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"code\": \"POSTEPAY\",\n" +
            "                \"label\": \"PostePay\",\n" +
            "                \"method\": \"DEBIT_CARD\",\n" +
            "                \"grouping\": \"DEBIT_CARD\",\n" +
            "                \"registration\": \"OPTIONAL\",\n" +
            "                \"recurrence\": \"NONE\",\n" +
            "                \"redirect\": false,\n" +
            "                \"links\": {\n" +
            "                    \"logo\": \"https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/postepay.png\",\n" +
            "                    \"self\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/POSTEPAY\",\n" +
            "                    \"lang\": \"https://resources.integration.oscato.com/resource/lang/MOBILETEAM/en_US/POSTEPAY.json\",\n" +
            "                    \"operation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/POSTEPAY/charge\",\n" +
            "                    \"validation\": \"https://api.integration.oscato.com/pci/v1/6076b2feabe8170009d56de4l7ab1tlvai852jekk4s2h2b7it/MOBILETEAM/en_US/POSTEPAY/standard/validate\"\n" +
            "                },\n" +
            "                \"selected\": false,\n" +
            "                \"inputElements\": [\n" +
            "                    {\n" +
            "                        \"name\": \"holderName\",\n" +
            "                        \"type\": \"string\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"number\",\n" +
            "                        \"type\": \"numeric\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryYear\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"expiryMonth\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"verificationCode\",\n" +
            "                        \"type\": \"integer\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"operationType\": \"CHARGE\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";
}
