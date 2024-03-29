package com.xfor.infrastructure.core.finance.dao.mybatis;

import com.xfor.infrastructure.core.common.service.ServiceContext;
import com.xfor.infrastructure.core.finance.model.Invoice;
import com.xfor.infrastructure.core.finance.dao.InvoiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 */
@Component
public class InvoiceDAOImpl implements InvoiceDAO {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice getInvoiceBySid(ServiceContext sctx, String sid) {
        return null;
    }

    @Override
    public Invoice getInvoiceByNumber(ServiceContext sctx, String number) {
        return null;
    }

    @Override
    public List<Invoice> getInvoicesByOrderSid(ServiceContext sctx, String orderSid) {
        return null;
    }

    @Override
    public boolean saveInvoice(ServiceContext sctx, Invoice invoice) {
        return false;
    }

    @Override
    public boolean removeInvoiceBySid(ServiceContext sctx, String sid) {
        return false;
    }

    @Override
    public boolean removeInvoiceByNumber(ServiceContext sctx, String number) {
        return false;
    }
}
