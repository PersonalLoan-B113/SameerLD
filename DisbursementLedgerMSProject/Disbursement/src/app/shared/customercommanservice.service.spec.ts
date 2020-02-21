import { TestBed } from '@angular/core/testing';

import { CustomercommanserviceService } from './customercommanservice.service';

describe('CustomercommanserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CustomercommanserviceService = TestBed.get(CustomercommanserviceService);
    expect(service).toBeTruthy();
  });
});
