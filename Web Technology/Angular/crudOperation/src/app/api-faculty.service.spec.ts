import { TestBed } from '@angular/core/testing';

import { ApiFacultyService } from './api-faculty.service';

describe('ApiFacultyService', () => {
  let service: ApiFacultyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiFacultyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
